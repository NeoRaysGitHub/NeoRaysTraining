import React from 'react';

const User = (props) =>{
	var name = props.children;
	let age = props.age ? props.age : "NA"
	if(name){
		return(
			<div>
			Name : {name} || Age : {age}
				
				<table>
					<tr>
						<th>Name</th>
						<th>Age</th>
					</tr>
					<tr>
						<td>{name}</td>
						<td>{age}</td>
					</tr>
				</table>
			</div>
		);
	} else {
		return <div> Invalid User.</div>
	}
	
}
export default User;