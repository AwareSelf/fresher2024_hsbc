import {useState} from 'react';


function EmpForm(props)
{

  //  const [emp,setemp] = useState({empid:props.empid,empname:props.empname,empsal:props.empsal});
  const[emp,setemp]=useState({empid:'',empname:'',empsal:''});  
  const [emparr,setemparr] = useState([]);

  
    const changeEmpId =(event)=>{
        console.log(event.target.value);
        setemp({...emp,empid:event.target.value});
    }
    const changeEmpName =(event)=>{
        console.log(event.target.value);
        setemp({...emp,empname:event.target.value});
    }
    const changeEmpSal =(event)=>{
        console.log(event.target.value);
        setemp({...emp,empsal:event.target.value});
    }

    const submitHandler = (event)=>{
        event.preventDefault();
        console.log('on form submission:emp ='+emp.empid+","+emp.empname+","+emp.empsal);
        setemparr([...emparr,emp]);
        setemp({empid:'',empname:'',empsal:''});
    }

    return(
        <>
          <form onSubmit={(event)=>submitHandler(event)}>
            <label>
               EmpId:
               <input name="empId" value={emp.empid} onChange={event=>changeEmpId(event)} />
            </label>
            <br></br>
            <label>
               EmpName:
               <input name="empName" value={emp.empname} onChange={event=>changeEmpName(event)} />
            </label>
            <br></br>
            <label>
               EmpSal:
               <input name="empSal" value={emp.empsal} onChange={event=>changeEmpSal(event)} />
            </label>
            <br></br>
            <input type='submit'></input>
          </form>

          <hr/>
          { emp.empid!='' && <p>Recent emp being entered:{emp.empid},{emp.empname},{emp.empsal}</p> }
          { emp.empsal!='' && <p> AnnSal of emp:{emp.empsal*12}</p> }

          {emparr.length > 0 && <h3>List of all Emps!</h3> }
           <ul>
            {
                emparr.map(e=><li key={e.empid}>{e.empid},{e.empname},{e.empsal}</li>)
            }
           </ul>
        
        </>
    );
}
export default EmpForm;