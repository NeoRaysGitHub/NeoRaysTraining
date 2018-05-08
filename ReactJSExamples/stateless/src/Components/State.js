import React, { Component } from 'react';
import '../App.css';

class State extends Component {
constructor(){
  super();
  this.state = {
    data:
    [
      {
        "id":1,
        "name":"deepa",
        "age":"22"
      },
      {
        "id":2,
        "name":"ashu",
        "age":"22"
      },
      {
        "id":3,
        "name":"kavs",
        "age":"22"
      },
      {
        "id":4,
        "name":"pruthvi",
        "age":"22"
      }
    ]
  }
}
  render() {
    return (
      <div className="App">
      <Header/>
      <table>
      <tbody>
      {this.state.data.map((person,i) =>  <TableRow key = {i}
    data = {person}/>)}
    </tbody>
    </table>
      </div>
    );
  }
}

class Header extends React.Component{
  render(){
    return(
      <div className="App-state">
        <p><u> In State file</u></p>
      <h1>Header</h1>

      </div>
    );
  }
}

class TableRow extends React.Component{
  render(){
    return(
      <tr>
      <td>{this.props.data.id}</td>
      <td>{this.props.data.name}</td>
      <td>{this.props.data.age}</td>
      </tr>
    );
  }
}


export default State;
