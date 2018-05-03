import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import { SSL_OP_PKCS1_CHECK_2 } from 'constants';

class App extends Component {
 
  render() {
    var s={color:'red'}
    var s2={color:'blue'}
    var s3={color:'green'}
    return (
      
      <div style={s2}  className="App" >
        <h2 style={s}>My First React App</h2>
        <div>
          <h3 style={s3}>sum={3+4}</h3>
        </div>
        <p>Hello World from Recat js </p>
        <header/>
      </div>
    );
  }
}

export default App;
