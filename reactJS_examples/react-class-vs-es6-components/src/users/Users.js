import React, {Component} from 'react';
import User from './User';

class Users extends Component{
  render(){
    return(
    <div>
    <h1>{this.props.title}</h1>
<User age="20">kumar</User>
<User age="30">bharath</User>
<User age="40">chenur</User>
    </div>
  );
}
}
export default Users;
