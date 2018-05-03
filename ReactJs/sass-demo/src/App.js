import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import styled from 'styled-components';

const DivApp=styled.div`
  text-aligen:center;
  color:red;
`

class App extends Component {
  render() {
    return (
      <DivApp>
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to Sass</h1>
        </header>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>
      </div>
      </DivApp>
    );
  }
}

export default App;
