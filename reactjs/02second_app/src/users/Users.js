import React,{ Component } from 'react';
import User from './User';

class Users extends Component{

state={

  users:[

    {name:"sachin",age:20},
      {name:"dev",age:30},
        {name:"man",age:40},
  ],
  title:"Users List"
};

makeYounger = () => {
  const newState=this.state.users.map((users)=>{
const tempUser=user;
tempUser.age-=10;
return tempUser;

  })
  this.setState({

  })
}

render(){
  return (<div>
    <button onClick={this.makeYounger}>Make 10 years younger</button>
    <br/>
    <h1 color="red">{this.state.title}</h1>
<User age={this.state.users[0].age}>{this.state.users[0].name}</User>
<User age={this.state.users[1].age}>{this.state.users[1].name}</User>

<User age={this.state.users[2].age}>{this.state.users[2].name}</User>

     </div>)
}

}
export default Users;
