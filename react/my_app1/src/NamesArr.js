
import {useState} from 'react';

function NamesArr(props)
{
    const [namesarr,setnamesarr] = useState(['namrata','rahul','sita']);


    const addarr = (name)=>{
        setnamesarr([...namesarr,name]);
    }

    const removearr = (name)=>{

        const newarr = namesarr.filter(ele=>ele!=name);
        setnamesarr(newarr);

        //setnamesarr(namesarr.filter(ele=>ele!=name));
    }

    const updatearr = (name,newname)=>{
        const udatedarr = namesarr.map(ele=>ele===name?ele=newname:ele);
        setnamesarr(udatedarr);
    }

    return(

        <>
        <ul>
          { namesarr.map((name,index)=><li key={index}>{index}:{name}</li>)  }  
        </ul>
          
        <button onClick={()=>addarr('Arjun')}>Add Name</button>
        <button onClick={()=>removearr('rahul')}>Delete Name</button>
        <button onClick={()=>updatearr('namrata','nama')}>Update Name</button>
        </>
    );

}
export default NamesArr;