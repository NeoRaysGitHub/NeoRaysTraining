import React, { Component } from 'react';
import State from './Components/State';
import Stateless from './Components/Stateless';
import Props from './Components/Props';
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
      {/* <Stateless/>*/}
        {/*<State/>*/}
        <Props/>
      </div>
    );
  }
}

export default App;
