import React from 'react';
import '../App.css';

class Stateless extends React.Component {
  render() {
    return (
      <div className="App-stateless">
        <Header/>
        <Content/>
      </div>
    );
  }
}

class Header extends React.Component {
  render() {
    return (
      <div className="App">
          <p><u>In the stateless</u></p>
        <h1> Header</h1>

      </div>
    );
  }
}

class Content extends React.Component {
  render() {
    return (
      <div className="App">
        <h2>Content</h2>
      </div>
    );
  }
}

export default Stateless;
