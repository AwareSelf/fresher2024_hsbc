
import {useState} from 'react';

function AddEmp(props)
{
    const [emp,setemp] = useState({empid:props.empid,empname:props.empname,empsal:props.empsal});

  

    const changeEmpid = (event)=>{
        
        setemp({...emp,empid:event.target.value});

    }
    const changeEmpname = (event)=>{
        setemp({...emp,empname:event.target.value});
    }

    const changeEmpsal = (event)=>{
        setemp({...emp,empsal:event.target.value});
    }
    const handleSubmit =  (event)=>{
        event.preventDefault();
        console.log("inside handleSubmit:"+emp.empid+","+emp.empname+","+emp.empsal);
        props.addemp(emp);
        setemp({empid:'',empname:'',empsal:''});

    }

    return(
    <form onSubmit={(event)=>handleSubmit(event)}>

        <label>
            Empid:
            <input type="text" name="empid" value={emp.empid} 
                                   onChange={(event)=>changeEmpid(event)}/>
        </label>
        <br/><br/>
        <label>
            Empid:
            <input type="text" name="empname" value={emp.empname} 
                                   onChange={(event)=>changeEmpname(event)}/>
        </label>
        <br/><br/>
        <label>
            Empid:
            <input type="text" name="empsal" value={emp.empsal} 
                                   onChange={(event)=>changeEmpsal(event)}/>
        </label>
        <br/><br/>
        <input type="submit" value="Add Emp" />
    </form>
    );
}
export default AddEmp;