import React ,{Component} from 'react';
//import React from 'react';

class Login extends Component{

	render(){
		return(
				<div>
					User Name  <input type="text" placeholder="User Name" /><br/>
					Password  <input type="password" placeholder="Password" /><br/>
					<button onClick={this.home}>Login </button><br/>
					<a href="/">Home </a>
				</div>
			);
	}
}
export default Login;