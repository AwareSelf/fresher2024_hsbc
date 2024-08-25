
function Emp(props)
{
   
    const e = {empid:1,empname:'Ram',empsal:5000};
    const e1 = {empid:props.empid ,empname:props.empname ,empsal:props.empsal};


    return(
 
        <>
            <h3>empid = {e.empid}, empname = {e.empname},empsal = {e.empsal}</h3>
            <h3>empid = {e1.empid}, empname = {e1.empname},empsal = {e1.empsal}</h3>
            <ul>
                <li>empid={e1.empid}</li>
                <li>empname={e1.empname}</li>
                <li>empsal={e1.empsal}</li>
            </ul>
        
        </>
   
    )
}
export default Emp;