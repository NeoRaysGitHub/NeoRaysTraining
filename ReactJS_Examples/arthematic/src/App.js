import React, { Component } from 'react';

class App extends Component {
  add()
  {
    var num1 = document.getElementById("firstNumber").value;
    var num2 = document.getElementById("secondNumber").value;
    document.getElementById("result").innerHTML = parseInt(num1,10) + parseInt(num2,10);
  }
  substract()
  {
    var num1 = document.getElementById("firstNumber").value;
    var num2 = document.getElementById("secondNumber").value;
    document.getElementById("result").innerHTML = num1 - num2;
  }
  multiplyBy()
  {
    var num1 = document.getElementById("firstNumber").value;
    var num2 = document.getElementById("secondNumber").value;
    document.getElementById("result").innerHTML = num1 * num2;
  }

  divideBy()
  {
    var num1 = document.getElementById("firstNumber").value;
    var num2 = document.getElementById("secondNumber").value;
    document.getElementById("result").innerHTML = num1 / num2;
  }
  render(){
    return (
      <div className="App">
      <h2>Arthematic Operations</h2>
      <form>
        First Number : <input type="text" id="firstNumber" /><br/>
        Second Number: <input type="text" id="secondNumber" /><br/>
        <input type="button" onClick={this.add} value="Addition" />
        <input type="button" onClick={this.substract} value="Substraction" />
        <input type="button" onClick={this.multiplyBy} value="Multiply" />
        <input type="button" onClick={this.divideBy} value="Divide" />
      </form>
      <p>The Result is :
      <span id="result"></span>
      </p>
      </div>
    );
  }
}
export default App;
