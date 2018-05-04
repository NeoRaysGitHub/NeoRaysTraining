import React from 'react';

const   User= (props) =>{
    let age=props.age ? props.age: 'NA';
    if(props.age){
        return(
            <div>
               Name is:- {props.children}
               Age is:-{props.age}
            </div>
    )
    }else
        {
        return <div>Invalid Input</div>
        }

}
export default User;