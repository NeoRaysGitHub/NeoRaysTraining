import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  state={
    name:'sachin'
  }
  changeName = (newName) =>{
    this.setState({
        name:newName
    })
}
changeNameFromInput = (event) =>{
  this.setState({
      name:event.target.value
  })
}

  render() {
    return (
      <div className="App">
        <br/> <br/>
        <button onClick={() => this.changeName('awesome-sachin')}>Change state using Anon Function</button><br/> <br/>
<button onClick={this.changeName.bind(this,'awesome-sachin (-_-)$')}>Change state using Anon Function</button>
        <br/> <br/>
        <input type="text" onChange={this.changeNameFromInput} value={this.state.name}/>

        <br/> <br/>
        <div class="abc">{this.state.name}</div>
      </div>
    );
  }
}

export default App;
