import React, { Component } from 'react';
import './App.css';

class App extends Component {
  constructor()
  {
    super();
    this.state={
      data: 'I am Harishankar Pradhan'
    }
    this.updateState=this.updateState.bind(this);
  }
  updateState(){
    this.setState({data: "Data is updated to Suresh"})
  }
  render() {
     return (
        <div align="center">
          <button onClick={this.updateState}>Click..</button>
          <h3>{this.state.data}</h3>
        </div>
     );
  }
}

export default App;
