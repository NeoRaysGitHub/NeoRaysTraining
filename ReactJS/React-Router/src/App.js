import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router} from 'react-router-dom';
import Route from 'react-router-dom/Route';
import User from './components/User';
import Login from './components/Login';

class App extends Component {
  render() {
    return (
      <Router>
      <div className="App">
        <Route path={"/"} exact render={
          ()=>{
            return(<div>
              
              <div className="navbar-header">
                 <a href="/">Home</a> ||   
                 <a href="/about">About</a>  ||  
                 <a href="/user">User</a>  ||
                 <a href="/login">Login</a>
              </div> 
                  <h1>
                  Home
                  </h1>
                  <hr/>
              Welcome Router
            </div>);
          }
        } />
        <Route path={"/about"} exact render={
          ()=>{
            return(<h1>About.. Page</h1>);
          }
        } />
        <Route path={"/user"} component={User} />

        <Route path={"/login"} component={Login} />

      </div>
      </Router>
    );
  }
}

export default App;
