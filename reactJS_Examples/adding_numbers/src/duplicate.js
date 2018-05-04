import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class Duplicate extends Component {
  addNumbers(e){
    e.preventDefault();
    console.log("hghg");

    var fn=4;
    var sn=4;
    var result=fn+sn;

    alert("Addition of "+fn+" and "+sn+" is "+result);

  }

  render() {

    return (

      <div className="Duplicate">
        <form>
        First Number:<input type="text" name="fn" placeholder="number" /><br/>
        Second Number:<input type="text" name="sn" placeholder="number" /><br/>
        <button onClick={this.addNumbers.bind(this)}> add </button> {/*onClick button will not take input values to function but onSubmit will take values to function*/}


        </form>
      </div>
    );
  }
}

export default Duplicate;
