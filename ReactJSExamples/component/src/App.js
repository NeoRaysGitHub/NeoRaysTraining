import React, { Component } from 'react';
import State from './Component-API/State';
import Forceupdate from './Component-API/Forceupdate';
import Finddom from './Component-API/FindDomNode';
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        <State/>
        <Forceupdate/>
        <Finddom/>
      </div>
    );
  }
}

export default App;
