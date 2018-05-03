import React, { Component } from 'react';
import Parent from './Component/ParentToChild/Parent';
import './App.css';

class App extends Component {

  state = {
    title: 'PlaceHold title'
  }

  changeWorldTitle = (newTitle) => {
    this.setState({
      title:newTitle
    });
  }

  render() {
    return (
      <div className="App">
      <br/><br/>
        <Parent changeTheWorldEvent={this.changeWorldTitle.bind(this, "New World")} title={this.state.title}
        KepTheWorldSaveEvent={this.changeWorldTitle.bind(this, "Save World")}
        />

      </div>
    );
  }
}

export default App;
