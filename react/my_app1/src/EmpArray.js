import { useState } from "react";

function EmpArray(props)
{
    const [emparr,setemparr] = useState([{empid:1,empname:'nama',empsal:5000},
                                         {empid:2,empname:'geeta',empsal:6000}
                                        ]);

    const addemp = (id,name,sal)=>{
                           setemparr([...emparr,{empid:id,empname:name,empsal:sal}]);
                          }
    
    const addemp1 = (e)=>{
                            setemparr([...emparr,e]);
                           }

     /*                      
    const updateemp = (id,name)=>{
    
     const newemparr = emparr.map(ele=>{
        if(ele.empid === id)
        {
           return {...ele,empname:name};
        }
        else
        {
           return {...ele};

        }
      })
       setemparr(newemparr);
    }
    */

    const updateemp = (id,name)=>{
    
     const newemparr = emparr.map(ele=>(ele.empid === id)?{...ele,empname:name}:ele)
        
        setemparr(newemparr);
     }
 

    return(
        <>
    
          <ul>
            {
              emparr.map(emp=><li key={emp.empid}>{emp.empid},{emp.empname},{emp.empsal}</li>)
            }

          </ul>
          <button onClick={()=>addemp(3,'rahul',7000)}>add emp</button>
          <button onClick={()=>addemp1({empid:4,empname:'rahul',empsal:8000})}>add emp</button>
          <button onClick={()=>updateemp(1,'neeraj')}>update emp</button>
        </>
    );
}
export default EmpArray;