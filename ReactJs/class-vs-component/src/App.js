import React, { Component } from 'react';
import logo from './logo.svg';
import UserClass from './User/UserClassComponent';
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        <br/>
        <p>I am from App</p>
        <UserClass title='Users List'/>
        
      </div>
    );
  }
}

export default App;
