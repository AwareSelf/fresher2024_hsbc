
import {useState} from 'react';
import axios from 'axios';

function EmpForm(props)
{  const[emp,setEmp] =  useState({empId:props.empid,
                                  empName:props.empname,
                                  empSalary:props.empsal});

   const baseurl = "http://localhost:8001/emprest/"; 
   const addEmp = (emp)=>{
    /* incase the form emp model and rest emp model aren't matching in property names
    copy form model into emp-rest-model that has properties exactly like 
    rest emp model
    */
    const restemp = {empId:emp.empId,empName:emp.empName,empSal:emp.empSalary};

    axios.post(baseurl+"emp",restemp)
        .then((response)=>{
            console.log(response.data);
            console.log(response.status);
            if(response.status==201)
            {
              console.log('emp with empId:'+emp.empId+' posted/created/added successfully..');
              //pass restemp i.e. the emp object to the emparr in the parent model
              props.addEmp(restemp); //communicate the restemp model from child to parent
            }
            else
            {
                console.log('emp with empId:'+emp.empId+'sent with httpstatus:'+response.status);
            }

        })
        .catch((error)=>{
            console.log(error);
        });
       
      console.log('next stat after invoking axios.post..');
   }//end of addEmp() method
   

   const handleSubmit = (event)=>   
    {
        event.preventDefault();
        //call addEmp methd to post the submitted emp to backend restservice
        addEmp(emp);
        setEmp({...emp,empId:'',empName:'',empSalary:''});
    }
    return(

     
        <form onSubmit={handleSubmit}>
            <label>
                empid:
                <input type='text'  
                   value={emp.empId}
                   onChange={e=>{setEmp({...emp,empId:e.target.value}); }}
            />
                            
            </label> <br/>
            <label>
                empname:
                <input type="text" 
                       value={emp.empName} 
            onChange={(e)=>setEmp({...emp,empName:e.target.value})} 
            />
             
            </label> <br/>
            <label>
                empsalary:
                <input type="text" 
                       value={emp.empSalary} 
           onChange={(e)=>setEmp({...emp,empSalary:e.target.value})} 
              />
            </label><br/>
            <input type="submit" />        
        </form>
    );
}

export default EmpForm;