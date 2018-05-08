import React, { Component } from 'react';

import './App.css';
import Parent from './components/parentToChild/parent';

class App extends Component {
  state={
    title:'placeholder title'
  }
  changeTheWorld=(newTitle)=>{
    this.setState({title:newTitle});
  }
  render() {
    return (
      <div className="App">
      <Parent dowhatever={this.changeTheWorld.bind(this,'hellow world welcome to neorays')} title={this.state.title}/>
      </div>
    );
  }
}

export default App;
