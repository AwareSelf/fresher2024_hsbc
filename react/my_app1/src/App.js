
import './App.css';
import Emp from './Emp';
import { useState } from 'react';
import EmpStateChange from './EmpStateChange';
import EmpStateChange1 from './EmpStateChange1';
import NamesArr from './NamesArr';
import EmpArray from './EmpArray';
import ChangeEvent from './ChangeEvent';
import EmpForm from './EmpForm';
import Car from './CarClassComponent';
import EmpClassComp from './EmpClassComponent';

function App(props) {

  const [no,setno] = useState(4);
  const [no1,setno1] = useState(props.n1);
 // const no1 = props.n1;

 const empsal=20000;
 const studname='Mikhil';

  const greet = ()=>{
    alert('hi all')
  }

  const greetByName = (name)=>{
    alert('hi '+name)
  }

  
  const changeno = (num)=>{
   setno(num);
   setno1(10);
    alert(no);
  }
    
  
  return (
    
   
      <div className="App">
      {/*
       <h3>Hello Everyone!</h3>
       <p>no is {no}, no1 is {no1}</p>   
       {greet()}  
       <button onClick={greet}>Greet</button>
       <button onClick={()=>greetByName('namrata')}>GreetByName</button>
       <button onClick={()=>changeno(5)}>ChangeNo</button>
       <hr/>
       <Emp empid={2} empname={'Radha'}  empsal={3000}/>
       <hr/>
       <EmpStateChange empid={1} empname={'Radhika'} empsal={empsal} />
       <hr/>
       <EmpStateChange1/>
       <hr/>
       <NamesArr/>
       <hr/>
       <EmpArray/>
       <hr/>
       */}
      <ChangeEvent studname={studname}/>
      <hr/>
      <EmpForm empid={1} empname={'Ram'} empsal={5000} />
      <hr/>
       <h5>Using React Class Component</h5>
       <Car mycolor={'red'}/>
       <hr/>
       <EmpClassComp empid={1} empname={'nama'} empsal={4000} />
      </div>
      

  );
}

export default App;
