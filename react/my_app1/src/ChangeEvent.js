import {useState} from 'react';


function ChangeEvent(props)
{

    const [name,setname] = useState(props.studname);
    const [namearr,setnamearr] = useState([]);

    const changeName = (event)=>{
           console.log(event.target);
           console.log(event.target.value);
           setname(event.target.value);
    }
    const submitHandler = (event)=>{
        event.preventDefault();
       // alert('final value of myname of form submission is:'+name);
        setnamearr([...namearr,name]);
        setname('');
    }

    return(
        <>
          <form onSubmit={(event)=>submitHandler(event)}>
            <label>
               Myname:
               <input name="myname" value={name} onChange={event=>changeName(event)} />
               <input type='submit'></input>
            </label>
          </form>

           <ul>
            {
                namearr.map((ele,index)=><li key={index}>{ele}</li>)
            }
           </ul>
        
        </>
    );
}
export default ChangeEvent;