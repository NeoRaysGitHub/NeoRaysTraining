import React, { Component } from 'react';

const User = (props) => {
    var age=props.age?props.age:'NA'
    if (props.children) {
        return (
            <div>
               
                Name: {props.children} , Age: {age}
            </div>
        )
    } else {
        return <div>Invalide User:Plse Enter Name & Age</div>
    }
   
}

export default User;