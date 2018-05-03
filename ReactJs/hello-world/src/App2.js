import React, { Component } from 'react';
import logo from './logo.svg';
import './App2.css';
import { SSL_OP_PKCS1_CHECK_2 } from 'constants';

class App2 extends Component{
    render(){
        return(
            <div className='App2'>
                <h3>WelCome</h3>
                <p>this is nested App</p>
            </div>
        );
    }
}

export default App2;