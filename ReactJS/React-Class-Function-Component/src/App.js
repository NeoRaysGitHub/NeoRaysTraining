import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import Users from './user/Users';

class App extends Component {
  render() {
    return (
      <div className="App">
        <Users title="Users List." />
        
      </div>
    );
  }
}

export default App;
  