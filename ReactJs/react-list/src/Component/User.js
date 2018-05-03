import React from 'react';

const User=(props)=>{
   return( <li>
        <span>Name={props.children}, Age={props.Age}</span>
    </li>
    
   )    
}

export default User;