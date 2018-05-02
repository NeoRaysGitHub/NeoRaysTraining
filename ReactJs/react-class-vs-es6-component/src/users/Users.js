import React,{ Component } from "react";
import User from './User'
class Users extends Component{
  state = {
    users:[
      {name:"manjunath", age :"27"},
      {name:"rathnam ", age :"29"},
      {name:"Ramanji", age :"28"}
    ],
    title : "Users List"
  };

  clickMe1 = () => {

      const newState = this.state.users.map((user) =>{
        const tempUser = user;
        tempUser.age -=10;
        return tempUser;
      });
      this.setState({
        newState
      });
  }


render(){
  return(
  <div>

  <h1>{this.state.title}</h1>
    <User age={this.state.users[0].age}>{this.state.users[0].name}</User>
    <User age={this.state.users[1].age}>{this.state.users[1].name}</User>
    <User age={this.state.users[2].age}>{this.state.users[2].name}</User>
    <br/>
    <button onClick = {this.  clickMe1}>Clik me</button>
  </div>
)
}
}
export default Users;
