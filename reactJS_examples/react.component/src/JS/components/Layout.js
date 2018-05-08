import React from "react";
import ReactDOM from "react-dom";
 export  default class Layout extends React.Component{
  constructor(){
    super();
    this.name="bharatrh";
  }
  render(){
    return(
      <h1>its {this.name}!</h1>
    );
  }
}
