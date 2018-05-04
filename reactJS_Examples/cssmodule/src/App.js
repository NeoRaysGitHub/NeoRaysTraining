import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class CommentBox extends Component {
  render() {
    return (
      <div style={{ fontSize : "36px" ,color:"red", backgroundColor:"blue" }} className="CommentBox">
      Hello world!! I am a comment box
      <h1> welcome back</h1>
        {this.props.attribute[0]}<br/>
          {this.props.attribute[1]}<br/>
            {this.props.attribute[2]}<br/>


          {/*  {this.props.attribute.one}*/}
      </div>

/*if we used as font-size then its normal css*/

    );
  }
}

export default CommentBox;
