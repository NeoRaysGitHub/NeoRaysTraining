import React, { Component } from 'react';
import './App.css';
import Parent from './Components/parentToChild/parent';

class App extends Component {
 state ={
   title:'placehoder title'
 }
 changeTheWorld=(newTitle)=>{
   this.setState(
     {title:newTitle}
    )
 }

  render() {
    return (
      <div className="App">
        <Parent whatever={this.changeTheWorld.bind(this,'hello world')} title={this.state.title}/>
      </div>
    );
  }
}

export default App;
