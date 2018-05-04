import React from 'react';

const User = (props) =>{
		//var name = props.children;
		return(
			<div>
			User Name : {props.children} | | User age :{props.age}
			</div>
		);
	
}
export default User;