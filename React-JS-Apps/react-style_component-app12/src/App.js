import React, { Component } from 'react';
import logo from './logo.svg';
import styled,{keyframes} from 'styled-components';

const AppWrapper=styled.div`
text-align: center;
`
const AppHeader=styled.div`
background-color:${props => props.isBlack ? '#222' : 'red'};
height: 150px;
padding: 20px;
color: white;
@media (min-width:400px){
  background-color:blue;
}
`
const AppIntro=styled.div`
font-size: large;
`

 const ApplogoSpin=keyframes`
 from { transform: rotate(0deg); }
  to { transform: rotate(360deg); }
 `

const Applogo=styled.img`
height: 80px;
animation:${ApplogoSpin} infinite 20s linear;
`

class App extends Component {
  render() {
    return (
      <AppWrapper>
        <AppHeader isBlack={false}>
          <Applogo src={logo}  alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </AppHeader>
        <AppIntro>
          To get started, edit <code>src/App.js</code> and save to reload.
        </AppIntro>
      </AppWrapper>
    );
  }
}

export default App;
