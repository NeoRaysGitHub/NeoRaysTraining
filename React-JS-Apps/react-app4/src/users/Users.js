import React, {Component} from 'react';
import User from './User';

class Users extends Component{

   render(){
       return(
          <div>
              <h1>{this.props.title}</h1>
               <User>Harishankar</User>
               <User age="20">Suresh</User>
               <User age="30">Bharat</User>
               <User age="40">Mithilesh</User>
           </div>
      )
   }
}

export default Users;