import React, { Component } from 'react';

import './App.css';
import User from './Component/User';

class App extends Component {

  state={
    Users:[
      {Name:'jagabandhu', Age:25},
      {Name:'Bikram', Age:35},
      {Name:'Pravat', Age:20}
    ]
  }

  render() {
    return (
      <div className="App">
        <ul>
          {
            this.state.Users.map((User)=>{
                return(<User Age={User.Age}>{User.Name}</User>)
            })

            }
          }
        </ul>
      </div>
    );
  }
}

export default App;
