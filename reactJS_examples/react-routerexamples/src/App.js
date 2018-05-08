import React, { Component } from 'react';
import './App.css';
import{ BrowserRouter as Router, Link,NavLink, Redirect} from 'react-router-dom';
import Route from 'react-router-dom/Route';
        const User=({match})=>{
              return(<h1>Welcome User {match.params.username}</h1>)
          }
            class App extends Component {
                state={
                  loggedIn:false
                  }
                    loginHandle=()=>{
                      this.setState({loggedIn:true})
                                  }
        render() {
          return (
            <Router>
              <div className="App">
                <ul>
                  <li>
                  /*<Link to="/">HOme</Link>*/
                      <NavLink to="/" activeStyle={{color:'green'}}>HOme</NavLink>
                  </li>
                  <li>
                      <NavLink to="/about/" exact activeStyle={{color:'red'}}>about</NavLink>
                  </li>
                  <li>
                    <NavLink to="/user/bharath" extact activeStyle={{color:'blue'}}>user bharath</NavLink>
                  </li>
                  <li>
                    <NavLink to="/about/kumar" exact  activeStyle={{color:'orange'}}>about kumar</NavLink>
                  </li>
              </ul>
                      <input type="button" value="log in" onClick={this.loginHandle.bind(this)}/>
                        <Route path="/" exact strict render={
                          ()=>{
                            return(<h1>welcome home</h1>)
                              }
                              }/>
                              <Route path="/about/"  exact strict render={
                                ()=>{
                                  return(<h1>welcome to about </h1>)
                                    }
                                  }/>
                                              <Route path="/about/kumar"  exact strict render={
                                                ()=>{
                                                  return(<h1>welcome to kumar </h1>)
                                                    }
                                                }/>
                                                <Route path="/user/:username"  exact strict render={
                                                  ()=>(
                                                  this.state.loggedIn ? (<User/>):(<Redirect to="/"/>)
                                                  )}/>
                                                    </div>
      </Router>
    );
  }
}
export default App;
