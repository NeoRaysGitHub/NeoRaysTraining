import React, { Component } from 'react';
import './App.css';

class App extends Component
{
  constructor(){
    super();
    
    this.state={
      count : 0
    }
  }
  increment(){
    this.setState({
      count:this.state.count + 1
    })
  }
  decrement()
  {
    this.setState({
      count:this.state.count - 1
    })
  }
  render(){
    return(
      <div>
        <h2>Current Count: {this.state.count}</h2>
        <Increment increment={this.increment.bind(this)}/>
        <Decrement decrement={this.decrement.bind(this)}/>
      </div>
      
    )
  }
}
class Increment extends Component
{
  render(){
    return(
      <div>
        <button onClick={this.props.increment}>Higher</button>
      </div>
    )
  }
}
class Decrement extends Component
{
  render(){
    return(
      <div>
        <button onClick={this.props.decrement}>Lower</button>
      </div>
    )
  }
}
export default App;

