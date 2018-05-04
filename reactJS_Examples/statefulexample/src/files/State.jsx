import React from 'react';
import TableRow from './TableRow.jsx'

class State extends React.Component {
constructor(){
    super();
    this.state = {
      data:[
        {
        "id":1,
        "name":"pinki",
        "age":"5"
      },
      {
        "id":2,
        "name":"rinki",
        "age":"6"
      }
    ]
    }
  }
  render(){
    return(
      <div className="State">
      <h1>Header</h1>
        <table>

        {this.state.data.map((person,i) =><TableRow key={i} data1={person}/>)}

        </table>
      </div>
    );
  }
}


export default State;
