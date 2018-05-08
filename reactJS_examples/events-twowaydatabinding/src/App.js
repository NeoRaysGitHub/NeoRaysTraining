import React, { Component } from 'react';
import './App.css';
class App extends Component {
  state={
    name:'bharath kumar reddy chennuru'
  }
  changeName=(newName)=>{
    this.setState({
       name:newName
    })
  }
  changeNamefromInput=(event)=>{
    this.setState(
      {
        name:event.target.value
      }
    )
  }
  render() {
    return (
    <div className="App">
    <br/><br/>
    <button onClick={()=>this.changeName("bharath kumar redddy chennuru ")}> changeName funtion</button>
      <br/> <br/>
    <button onClick={this.changeName.bind(this,"bharath kumar redddy is aswome:")}> change using  bindingfunction </button><br/><br/>
    <input type="text" onChange={this.changeNamefromInput} value={this.state.name}/>
    <br/> <br/>
    <div>{this.state.name}</div>
    </div>
    );
  }
}
export default App;
