import React, { Component } from 'react';

import './App.css';

class App extends Component {
  constructor(props){
    super(props);
    this.state={
      data: "i am Harishankar"
    }
    this.updateState=this.updateState.bind(this); 
  }
  updateState(){
    this.setState({data: "Update Suresh"})
  }
  render() {
    return (
      <div>
        <Content myDataProp = {this.state.data} 
               updateStateProp = {this.updateState}></Content>
      </div>
    );
  }
}
class Content extends Component{
  render(){
    return(
      <div align="center">
        <button onClick = {this.props.updateStateProp}>CLICK</button>
            <h3>{this.props.myDataProp}</h3>
      </div>
    )
  }
}

export default App;
