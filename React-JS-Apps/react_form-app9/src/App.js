import React, { Component } from 'react';
import './App.css';

class App extends Component {
  constructor(props){
    console.log("I m in constructer")
    super(props);
    this.state={
      data: 'initial data...'
    }
    this.updateState=this.updateState.bind(this);
  }
  updateState(e){
    this.setState({data: e.target.value})
  }
  render(){
    console.log("render()....method")
    return(
      <div>
         <Content myDataProp = {this.state.data} 
               updateStateProp = {this.updateState}></Content>
      </div>
    )
  }
}
class Content extends React.Component
 {
  render() {
    console.log("content class render()..");
    return (
      <div align="center">
      <h2>Write Something</h2>
      <br/>
      <input type = "text" value = {this.props.myDataProp} 
               onChange = {this.props.updateStateProp} />
            <h3>{this.props.myDataProp}</h3>
      </div>
    );
  }
}
export default App;
