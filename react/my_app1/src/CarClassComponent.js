
import React from 'react';
class Car extends React.Component {
    constructor(props) {
      super(props);
      this.state = {color: this.props.mycolor};
    }

    changeCarColor = (colr)=>{
       this.setState({color:colr});
    }


    render() {
     
        return(<>
           <h4>The color of car is {this.props.mycolor}</h4>
           <h4>The color of car is {this.state.color}</h4>
           <button onClick={()=>this.changeCarColor('Blue')}>Change Color</button>
        </>);
    }    
  }
  export default Car;