import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import {App1}  from './App1.js';
class App extends Component {
      constructor(props){
        super();
        console.log(props);
        this.state={
          counter:0,
          counter1:0
        };
        /*setInterval(()=>{
          this.setState({counter:this.state.counter+1})
        },5000);*/
        this.updateCounter=this.updateCounter.bind(this);
        this.decreaseCounter=this.decreaseCounter.bind(this);
      }
updateCounter(){
  this.setState({counter:this.state.counter+1});
}
decreaseCounter(){
  this.setState({counter:this.state.counter-1});
}
  render() {
    console.log(this.props);
    return (
      <div>

          <App1 triggerParentUpdate={this.updateCounter} triggerParentUpdate1={this.decreaseCounter}/>

          <p><h1>{this.state.counter}</h1></p>
  </div>
    );
  }
}

/*App.defaultProps={
  num:10
};*/

export default App;
