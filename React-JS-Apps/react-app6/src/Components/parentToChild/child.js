import React from 'react';

const child =(props) =>{
    return(
        <div>
            <br/>
            <br/>
            <button onClick={props.whatever}>{props.xyz}</button>
        </div>
    )
}
export default child;