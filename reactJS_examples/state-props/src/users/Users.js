import React,{Component} from 'react';
import User from'./User';
class Users extends Component{
state ={
  users:[
    {name:"kumar", age:20},
      {name:"bharatyh", age:30},
        {name:"chennurur", age:40},
  ],
  title:"Users List"
};

makeMeYounger=()=>{

//this.state.users[0].age-=10;//dont use
/*
this.setState({
  users:[
    {name:"kumar", age:10},
      {name:"bharatyh", age:20},
      {name:"chennurur", age:30},
     ]
})
console.log(this.state.users);
*/
const newState =this.state.users.map((user)=>{
  const tempUser=user;
  tempUser.age-=10;
  return tempUser;
});
this.setState({
  newState
});
}
  render(){
    return(<div>
      <button onClick={this.makeMeYounger}>click me</button>
      <br/>

      <h1>{this.state.title}</h1>
      {this.state.users.map((user)=>{
        return <User age={user.age}>{user.name}</User>
      })
      /*
<User age={this.state.users[0].age}>{this.state.users[0].age}</User>
<User age={this.state.users[1].age}>{this.state.users[1].age}</User>
<User age={this.state.users[2].age}>{this.state.users[2].age}</User>
*/
}
</div>
);
  }
}
export default Users;
