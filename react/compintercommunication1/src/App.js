import logo from './logo.svg';
import './App.css';
import AddEmp from './AddEmp';
import {useState} from 'react';

function App() {

  const initarr = [{empid:1,empname:'Ram',empsal:5000}];
  const [emparr,setemparr] = useState(initarr);

  const handleemp = (emp)=>{

    console.log('handleemp called:emp='+emp.empid+","+emp.empname+","+emp.empsal);
    setemparr([...emparr,emp]);
  }

  return (
    <div className="App">
      <header className="App-header">
       <AddEmp empid={1} empname={'Ram'} empsal={2000}  addemp={(emp)=>{handleemp(emp) }} />
        <hr/>
        <ul>
          {emparr.map(e=><li key={e.empid}>{e.empid},{e.empname},{e.empsal}</li>)}
        </ul>
      </header>
    </div>
  );
}

export default App;
