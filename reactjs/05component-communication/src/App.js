import React, { Component } from 'react';
import './App.css';
import Parent from './components/parentToChild/parent';
class App extends Component {
  state ={

    title:'place holder title'
  }
changeTheWorld=(newTitle => {
  this.setState({title:newTitle});
})

  render() {
    return (
      <div className="App">
      <Parent doWhaterver={this.changeTheWorld.bind(this,'new world')} title={this.state.title}/>
      </div>
    );
  }
}

export default App;
