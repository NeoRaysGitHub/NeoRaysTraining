import React ,{Component} from 'react';
import User from './User';

class Users extends Component{
	state = {
		users: [
			{Name :"Suresh",Age :20},
			{Name :"Hari",Age :40},
			{Name :"Mittu",Age :30},
			{Name :"Reddy",Age :50}
		],
		title : "Users List",
	}
	makeYounger = ()=> {
		let newState = this.state.users.map(
		(user)=>{
		let tempUser = user;
			tempUser.Age -=10;
			return tempUser; 
		}
		);
		this.setState({newState});
	}
	render(){
		return(
			<div >
			<button onClick={this.makeYounger}>Make Them Younger</button>
			<h1> {this.state.title}</h1> <hr/>
			<User age={this.state.users[0].Age}> {this.state.users[0].Name} </User>
			<User age={this.state.users[1].Age}> {this.state.users[1].Name} </User>
			<User age={this.state.users[2].Age}> {this.state.users[2].Name} </User>
			</div>
			);
	}	
}

export default Users;