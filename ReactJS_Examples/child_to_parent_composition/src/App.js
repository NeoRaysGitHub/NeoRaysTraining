import React, { Component } from 'react';
import ChildEvents from './Events/ChildEvents';
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        <ChildEvents/>
      </div>
    );
  }
}

export default App;
