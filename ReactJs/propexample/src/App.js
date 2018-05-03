import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  
  render() {
    
    var sty={color:'green'}
    return (
      <div className="App">
      <br></br>
        <text style={sty}>Hello:{this.props.name}</text>
      </div>
    );
  }
}

export default class ListOfGreetings extends Component{
  render(){
   return(
     <view style={{alignItems:'center'}}>
       <App name='Jagabandu' />
        <App name='Manju Nath' />
        <App name='Bandhu' />
     </view>
   );
  }
}
