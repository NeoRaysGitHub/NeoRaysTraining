import React, { Component } from 'react';
import User from './User';

class Users extends Component{
render(){
  return  (
    <div>
    <h1>{this.props.title}</h1>
    <User ></User>
    <User age="25">jung</User>
    <User age="30">juck</User>
    </div>
  )
}

}

export default Users;
