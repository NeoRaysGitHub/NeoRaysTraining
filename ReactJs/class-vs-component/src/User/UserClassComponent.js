import React,{Component} from 'react';
import User from './User';
class UserClass extends Component{
   render(){
       return ( 
       <div>
           <h1>hello, i am from UserClass Component </h1>
           <h2>{this.props.title}</h2>
           <User >Jagabandhu </User>
           <User age='28'>Manjunath</User>
           <User/>
           <User age='24'>Bikram </User>
          
        </div>  
    )
   }
}

export default UserClass;