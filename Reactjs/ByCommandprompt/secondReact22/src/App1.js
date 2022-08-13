import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

export class App1 extends Component {
      constructor(props){
        super(props);

      };

  render() {
    return (
      <div>
          <button onClick={this.props.triggerParentUpdate}>UPDATE</button>
          <button onClick={this.props.triggerParentUpdate1}>DECREASE</button>
     </div>
    );
  }
}

/*App.defaultProps={
  num:10
};*/

export default App1;
