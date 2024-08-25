import {useState} from 'react'; 

function EmpStateChange(props)
{

    const [empid,setempid] = useState(props.empid);
    const [empname,setempname] = useState(props.empname);
    const [empsal,setempsal] = useState(props.empsal);

    const changeEmp = (empid,empname,empsal)=>{
        setempid(empid);
        setempname(empname);
        setempsal(empsal);
    }

    return(
        <>
          <ul>
            <li>{empid}</li>
            <li>{empname}</li>
            <li>{empsal}</li>
          </ul>
        <button onClick={()=>setempname('namrata')}>Change Empname</button>
        <button onClick={()=>changeEmp(12,'Sita',18000)}>Change Emp</button>
        </>
    );

}
export default EmpStateChange;