import React, { Component } from 'react';

import './App.css';
import $ from 'jquery';

class App extends Component {
  constructor(props){
    super(props);
    this.state ={
      users:[]
    }
  }
  componentDidMount(){
    $.ajax({
      url:"https://jsonplaceholder.typicode.com/users",
      success:(data) => {
        this.setState({
          users:data
        })
      }
    })
  }
  render() {
    const {users} = this.state;
    return (
      <div className="App">
        <ul>
{
  users.map((user) =>{
    return <li key={user.id}>{user.name}</li>
  })
}

        </ul>
      </div>
    );
  }
}

export default App;
