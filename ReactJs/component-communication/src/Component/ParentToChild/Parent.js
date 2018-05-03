import React from 'react';
import Child from './Child';

const Parent=(props)=>{
    return(
        <div>
            <Child doWhatever={props.changeTheWorldEvent} title={props.title} />
            <Child doWhatever={props.KepTheWorldSaveEvent} title={props.title} />
        </div>
    )
}

export default Parent;