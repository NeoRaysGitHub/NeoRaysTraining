import React, { Component } from 'react';
import './App.css';

class App extends Component {
  state={
    name:'Neorays'
  }

    changeName=(newName)=>{
      this.setState({
       name:newName
      })
    }

    changeNameByInput=(newName)=>{
      this.setState({
       name:newName.target.value
      })
    }

  render() {
    return (
      <div className="App">
        <br/><br/>
        <button onClick={()=>this.changeName('Cluster India :(')}>Change state by anon Function</button>
        <button onClick={this.changeName.bind(this,'Cluster India ):')}>Change state using binding Function</button>
        <br/><br/>
        <input type ="Text" onChange={this.changeNameByInput} value={this.state.name}/>
       <div>{this.state.name}</div>
      </div>
    );
  }
}

export default App;
