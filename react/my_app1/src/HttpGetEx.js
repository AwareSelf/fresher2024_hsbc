import { useEffect, useState } from 'react';
import  axios  from 'axios';

function HttpGetEx()
{
    const [emplst,setemplst]=useState([]);

    const url = 'http://localhost:8001/emprest/';

    useEffect(()=>{

        axios.get(url+'emps')
        .then((response)=>{
              console.log(response.status);
              console.log(response.data);
              setemplst(response.data);

              })
        .catch((error)=>{
             console.log(error);
            });


    },[]);


    return(
        <>
        <ul>
         {
          emplst.map(e => <li key={e.empId}>{e.empId},{e.empName},{e.empSal}</li>)
         }
         </ul>
        </>
    );
}

export default HttpGetEx;