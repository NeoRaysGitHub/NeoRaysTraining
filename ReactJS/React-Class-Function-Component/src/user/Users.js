import React ,{Component} from 'react';
import User from './User';

class Users extends Component{
	render(){
		return(
			<div >
			<h1>{this.props.title}</h1>
				<hr></hr>
				<User>Suresh</User>
				<User age="24">Venky</User>
				<User age="25">Poorna</User>
			</div>
			);
	}	
}

export default Users;