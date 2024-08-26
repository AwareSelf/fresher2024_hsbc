import logo from './logo.svg';
import './App.css';
import {useState,useEffect} from 'react';
import axios from 'axios';
import EmpForm from './EmpForm';

function App() {

 

   const [emparr,setemparr] = useState([]);
   const baseurl = "http://localhost:8001/emprest/"; 

   useEffect(()=>{

    console.log('inside useEffect hook');
    axios.get(baseurl+"emps")
    .then((response)=>{
          console.log(response.data);
          console.log(response.status);
          setemparr(response.data);

    })
    .catch((error)=>{console.log(error)});

   },[]);


   const deleteemp = (empid)=>{

        axios.delete(baseurl+"emp/"+empid)
             .then((response)=>{
               console.log(response.data);
               console.log(response.status);
               handledeleteemp(empid);             
               })
             .catch();
   }

   const updateemp = (emp)=>{
    //code to update emp will come here
   }

   const handleAddEmp = (emp)=>{
      console.log('parent App:emp:'+emp.empId+","+emp.empName+","+emp.empSal);
     //emp is the same emp object just now added/posted to the backend from EmpForm component
      setemparr([...emparr,emp]);
   }

   const handledeleteemp = (id)=>{
    const newemparr = emparr.filter(ele=>ele.empId!=id)
         setemparr(newemparr);
    }

  return (
    <div className="App">
      <header className="App-header">
        
        <EmpForm empid={3} empname={'Arjun'} empsal={12000}  
                  addEmp={(emp)=>{handleAddEmp(emp)}}
                  />
        <hr/>
        <table>
        <thead>
           <tr>
              <th>empid</th>
              <th>empname</th>
              <th>empsal</th>
           </tr>
        </thead>
        <tbody>
         { emparr.map(e=><tr key={e.empId}><td>{e.empId}</td>
                                           <td>{e.empName}</td>
                                           <td>{e.empSal}</td>
                                           <td><button onClick={()=>{deleteemp(e.empId)}}>Delete</button></td>
                                           <td><button onClick={()=>{updateemp(e)}}>Update</button></td>
                          </tr>
                     ) 
         }
        </tbody>
        </table>
      </header>
    </div>
  );
}

export default App;
