/*
How to fetch data from APIs using Asynchronous await in ReactJS ?
API: APIs are basically a type of application that stored data in 
the format of JSON (JavaScript Object Notation) and XML (Extensible Markup Language). 
It makes it possible for any device to talk to each other.

Asynchronous Await: Async ensures that the function returns a promise 
and wraps non-promises in it. There is another word Await, that works only
 inside the async function.
*/
import axios from 'axios';
import './HttpEmp.css';
import {useEffect,useState} from 'react';


 function Axioshttp()
{
    
   
    const [empId,setEmpId] = useState('');
    const[empName,setEmpName] = useState('');
    const [empSal,setEmpSal] = useState('');

    const [emps,setEmps] = useState(null);
    const [caption,setCaption] = useState('Add Emp');
 
    const url = 'http://localhost:8001/emprest/';

    const getAllEmps = () => {

        axios.get(url+'emps')
        .then((response)=>{

              const allemps = response.data;
              console.log('response from getall emps request..');
              console.log(allemps);
              setEmps(allemps);
          
            }
        )
        .catch((error)=>{

            console.log(error);

        });
    }

    const deleteEmp = (id) => {

        console.log('deleteEmp called with id:'+id);
        axios.delete(url+'emp/'+id)
        .then((response)=>{

              const isdeleted = response.data;
              console.log(isdeleted);

              setEmps((current) =>
              current.filter((emp) => emp.empId !== id)
            );
                       
            }
        )
        .catch((error)=>{

            console.log(error);

        });
    }

    const updateEmp = (e) => {

      console.log('update emp with id:'+e.empId);
      setEmpId(e.empId);
      setEmpName(e.empName);
      setEmpSal(e.empSal);
      setCaption('Update Emp')
           
  }

    const handleSubmit =  (event)=>{

        event.preventDefault();
        addPut(empId,empName,empSal);
        setCaption('Add Emp');
               
    }

    const addPost = async (empId,empName,empSal)=>{

       let response = await axios.post(url+'emp',{
        empId:empId,
        empName:empName,
        empSal:empSal
       });

       if(response.status==201)
       {
        setEmps([response.data,...emps]); 
        setEmpId('');
        setEmpName('');
        setEmpSal('');
       }
       else
       {
        console.log('post emp failed: response status:'+response.status+':'+response.statusText);
       }
    }

    const addPut = (empId,empName,empSal)=>{

      console.log("inside addPut:"+empId+","+empName+","+empSal);
      let emp = {
        empId:empId,
        empName:empName,
        empSal:empSal
       };
      axios.put(url+'emp',emp)
      .then((response)=>{

        if(response.status==200)
        {

          console.log(response.status);
          console.log(response.data);
           // getAllEmps();  //--no need to retrive all emps from backend again, instead update emp in emp-list locally
           const updatedemps = emps.map(e => {
            //iterate all emps and check
            //if empId equals 2, update all properties of that emp
            if (e.empId === empId) {
              return {...e, empId: emp.empId,empName: emp.empName,empSal:emp.empSal};
            }
            // otherwise return the emp as is
            return e;
          });
      
          setEmps(updatedemps);
          setEmpId('');
          setEmpName('');
          setEmpSal('');
        }
        else if(response.status==201)
        {
          console.log(response.status);
          console.log("emp with empId:"+emp.empId+" created...");
          
          //put request resulted in adding new emp as emp with that empId was not present
          setEmps([emp,...emps]); 
        }
        else
        {
         console.log('update(put) emp failed: response status:'+response.status+':'+response.statusText);
        }

      })
      .catch((error)=>{ console.log(error)})

    
   }


    useEffect(() => {
        getAllEmps();
    }, []);

   
    return(
        <div>
          <div className='posts-container'>
           
            <form onSubmit={handleSubmit}>
                <label>
                 Emp Id:   <br></br>
                <input type='text' className='form-control' value={empId} 
                onChange={(event)=>setEmpId(event.target.value)}/>
                </label> <br/>
                <label>
                 Emp Name:   <br></br>
                <input type='text' className='form-control' value={empName} 
                onChange={(event)=>setEmpName(event.target.value)}/>
                </label> <br/>
                <label>
                 Emp Salary:   <br></br>
                <input type='text' className='form-control' value={empSal} 
                onChange={(event)=>setEmpSal(event.target.value)}/>
                </label> <br/><br/>
                <input type='submit' value={caption}/>
             </form>
           </div>
         <hr/>  
           <div>
             {/*  <button onClick={ getAllEmps }>Get Emps</button>  */}
             <h1>Emp Details!</h1>
               <table id="emp">
               <thead>
                  { emps!=null &&
                   <tr>
                     <th>Id</th> 
                     <th>Name</th>
                     <th>Salary</th>
                     <th>Delete</th>
                     <th>Update</th>
                    </tr>
                  }
               </thead>
               <tbody>
                 { emps!=null &&
                   emps.map(e =>
                    <tr key={e.empId}>
                      <td>{e.empId}</td> 
                      <td>{e.empName}</td>
                      <td>{e.empSal}</td>
                      <td>
                        <button onClick={() =>deleteEmp(e.empId)}>Delete</button>
                      </td>
                      <td>
                        <button onClick={() =>updateEmp(e)}>Update</button>
                      </td>
                    </tr>)
                  }
                 </tbody> 
              </table>
            </div>
        </div>
      );
   

}

export default Axioshttp;

//https://dev.to/abdulbasit313/learn-how-to-create-react-js-table-with-hooks-that-has-delete-functionality-too-2jjb