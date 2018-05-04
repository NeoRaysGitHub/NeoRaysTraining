import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class Addition extends Component {
  addNumbers(e){
    e.preventDefault();
    console.log("hghg");
    var fn=parseInt(e.target.elements.fn.value);
    var sn=parseInt(e.target.elements.sn.value);
    var result=fn+sn;

    alert("Addition of "+fn+" and "+sn+" is "+result);
  }

  render() {

    return (

      <div className="Addition">
        <form onSubmit={this.addNumbers.bind(this)}>
        First Number:<input type="text" name="fn" placeholder="number" /><br/>
        Second Number:<input type="text" name="sn" placeholder="number" /><br/>
        <button > add </button>
        </form>
      </div>
    );
  }
}

export default Addition;
