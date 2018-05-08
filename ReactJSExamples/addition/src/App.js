import React, { Component } from 'react';
//import logo from './logo.svg';
//import './App.css';

class App extends Component {
  addMethod(e){
e.preventDefault();
    let fnum=parseInt(e.target.fnum.value);
    let snum=parseInt(e.target.snum.value);
    let total=(fnum+snum);
alert("the result is: "+total);
  }
  render() {
    return (
      <div>
      <form onSubmit={this.addMethod}>
      <input type="text" name="fnum" placeholder="first number"/>
        <input type="text"  name="snum" placeholder="second number"/>
      <button >Add</button>
      </form>



      </div>
    );
  }
}

export default App;
