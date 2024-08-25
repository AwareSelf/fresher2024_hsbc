
import React from 'react';
class EmpClassComp extends React.Component {
    constructor(props) {
      super(props);
      this.state = {empid: this.props.empid,
                    empname: this.props.empname,
                    empsal:this.props.empsal
                    };
    }

    changeEmpName = (name)=>{
       this.setState({empname:name});
    }


    render() {
     
        return(<>
           <h4>The emp: {this.props.empid}{this.props.empname}{this.props.empsal}</h4>
           <h4>The emp: {this.state.empid}{this.state.empname}{this.state.empsal}</h4>
           <button onClick={()=>this.changeEmpName('Lata')}>Change EmpName</button>
        </>);
    }    
  }
  export default EmpClassComp;