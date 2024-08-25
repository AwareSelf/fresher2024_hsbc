import {useState} from 'react'; 

function EmpStateChange1(props)
{

    const [emp,setemp] = useState({empid:1,empname:'Radha',empsal:4000});


    const changeEmpName = (myname)=>{ setemp({...emp,empname:myname}); }

    const changeEmp= (empid,empname,empsal)=>{
      setemp({empid:empid,empname:empname,empsal:empsal});
    }

    return(
        <>
          <ul>
            <li>{emp.empid}</li>
            <li>{emp.empname}</li>
            <li>{emp.empsal}</li>
          </ul>
       
        <button onClick={()=>changeEmp(1,'Sita',2000)}>Change Emp</button>
        <button onClick={()=>changeEmpName('Lata')}>Change Emp Name</button>
        </>
    );

}
export default EmpStateChange1;