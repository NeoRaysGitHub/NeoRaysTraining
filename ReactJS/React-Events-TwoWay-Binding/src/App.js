import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
    state = {
        name : "Suresh"
    }
    changeName = (newName)=> {
        this.setState({
        name : newName
    })
    }
    changeNameByInput = (event)=>{
        this.setState({
            name : event.target.value
        })
        
    }
  render() {
    return (
      <div className="App">
        <button onClick={this.changeName.bind(this,"Hari")}> Change Name</button> <br/>
        <hr/>
        <input type="text" onChange={this.changeNameByInput} value={this.state.name} />
        <div>{this.state.name}</div>
      </div>
    );
  }
}

export default App;
