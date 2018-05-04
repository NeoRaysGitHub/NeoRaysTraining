import React, { Component } from 'react';
import Demo1 from './components/Demo1';
import Homepage from './components/homepage';
import script from './components/script';
class App extends Component {
  render() {
    return (
      <div className="App">
      test
        <Demo1/>
        <Homepage/>
        <script/>
      </div>

    );
  }
}

export default App;
