import React, { Component } from 'react';
import './child.scss';

class Child extends Component {
  render() {
    return (
      <div className="inner">
        <h2>Green color</h2>
      </div>
    );
  }
}

export default Child;
