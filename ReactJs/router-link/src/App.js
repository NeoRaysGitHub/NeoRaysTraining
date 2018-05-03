import React, { Component } from 'react';
import './App.css';
import {BrowserRouter as Router,Link,NavLink} from 'react-router-dom';
import Route from 'react-router-dom/Route';
//import Route from 'react-router-dom/Route';

const User=()=>{
  return(<h2>Welcome User</h2>);
}

class App extends Component {
  render() {
    return (
      <Router>
      <div className="App">
      <ul>
        <NavLink to='/' activeStyle={
          {color:'green'}
        }>Home</NavLink>
        <br/><br/>
        <NavLink to='/about' activeStyle={
          {color:'green'}
        
        }>About</NavLink>
       
      </ul>
        <Route path='/' exact strict render={
          
          ()=>{
            return (<h2>Welcome to home</h2>);
          }
        }/>

        <Route path='/about' render={
          
          ()=>{
            return (<h2>Welcome to About</h2>);
          }
        }/>

        <Route path='/user' component={User}/>
      </div>
      </Router>
    );
  }
}

export default App;
