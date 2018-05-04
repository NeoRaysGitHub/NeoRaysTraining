import React, { Component } from 'react';

import './App.css';

class App extends Component {
  state = {
    name: 'Hari'
  } 

  changeName = (newName) => {
    this.setState({
      name: newName
    })
  }

  changeNameFromInput = (event) => {
    this.setState({
      name: event.target.value
    })
  }

  render() {
    return (
      <div className="App">
      <br/>
      {/* two way binding */}
      
      <br/>
      <button onClick={() => this.changeName('Harishankar')}>Change Using Anonymous Function</button>
      <br/>
      {/* bind is more effiecent */}
      <button onClick={this.changeName.bind(this, 'Suresh-prabhu')}>Change Using Bind</button>
        <br/><br/>
        {/* two way binding */}
        <input type="text" onChange={this.changeNameFromInput} value={this.state.name}/>
        <br/>
        <br/>
        <div>{this.state.name}</div>
      </div>
    );
  }
}

export default App;