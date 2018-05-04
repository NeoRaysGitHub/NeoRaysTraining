import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  onKeyUp = (target,key)=> {
      if(key.keyCode === 13){
        switch(target){
          case 'firstName' :
                this.lastName.focus();
                break;
          case 'lastName' :
                this.age.focus();
                break;
          case 'age' :
                this.submit.focus();
                break;
          default  :
                this.firstName.focus();
                break;
        }
      }
  }
  onClick = ()=>{
   alert('Refs Working ..');
      }
  render() {
    return (
      <div className="App">
        <div>
          <span> Enter First Name :</span>
          <input type="text"  
            ref = {               
              (input)=>{
                    this.firstName = input
                  }
                }
           onKeyUp ={this.onKeyUp.bind(this,'firstName')} />
        </div>
        <div>
          <span> Enter Last Name :</span>
          <input type="text"
            ref = {
              (input)=> {
                this.lastName = input
              }
            }
            onKeyUp = {this.onKeyUp.bind(this,'lastName')} />
        </div>
        <div>
          <span> Enter Age :</span>
          <input type="text" 
           ref = {
              (input)=> {
                this.age = input
              }
            }
            onKeyUp = {this.onKeyUp.bind(this,'age')} />
        </div>
        <div>
          <input type="submit" value="submit"
             ref = {
              (input)=> {
                this.submit = input
              }
            }  
            onClick={this.onClick}
            onKeyUp = {this.onKeyUp.bind(this,'submit')}
           />
        </div>
      </div>
    );
  }
}

export default App;
