import React, { Component } from 'react';

class Props extends Component {
  render() {
    return (
      <div className="Props">
      My projects
      <br/>

      {this.props.test};
      <br/>
{this.props.demo};
      </div>

    );
  }
}

export default Props;
