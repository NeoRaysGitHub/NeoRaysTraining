import React, { Component } from 'react';

import './App.css';

class App extends Component
{
  
  constructor(){
    super();
    console.log("constructor")
    this.state={
      count: 0

    };

    // this.state={
    //    count1: 6
    //  };
    
  }
  
  
  increament= () =>{
      this.setState({
        count: this.state.count+1 
      });
    
    }
    decrement=(count) => {
      this.setState({
        count: this.state.count-1
        
      });

    }
    render(){
      return(
      <div align="center">
          <div>
              <button onClick={this.increament}>Increament</button>
          <br/>
          <br/>
            {this.state.count}
          </div>
          <br/>
          <div>
            <button onClick={this.decrement}>Decrement</button>
          <br/>
          {
          //  this.state.count
          }
          </div>
        </div>
    )
  };
}
export default App;
