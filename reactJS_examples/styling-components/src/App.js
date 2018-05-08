import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import styled,{keyframes, css } from 'styled-components';
const Wrapper=styled.div`
  text-align:center;
`
const Div =styled.div`
text-align:center;
color:red;
`
const LogoSpin=keyframes`
from {transform:rotate(360deg);}
to{transform:rotate(0deg);
}
`
const spinAnimation = () => css `animation:${LogoSpin} infinite ${props=>props.time||20}s linear`;
const  Logo=styled.img.attrs({
  alt:'logo',
  src:logo,
})`
${spinAnimation()}
height: 80px;
`
const Header=styled.div`
  background-color: #222;
  height: 150px;
  padding: 20px;
  color: white;
  >h1{color: red;}
`
const Intro=styled.p`
  font-size: large;
`
class App extends Component {
  render() {
    return (
      <Wrapper>
      <Div>
        <Header>
          <Logo src={logo} alt="logo" time={0}/>
          <Logo src={logo} alt="logo" time={0}/>
            <Logo src={logo} alt="logo" time={0}/>
              <Logo src={logo} alt="logo" time={2}/>
                <Logo src={logo} alt="logo" time={1}/>
                  <Logo src={logo} alt="logo" time={0}/>
                    <Logo src={logo} alt="logo" time={10}/>
                      <Logo src={logo} alt="logo" time={1}/>
          <h1>Welcome to React</h1>
          <p>sub header here</p>
          </Header>
        <Intro>
          To get started, edit <code>src/App.js</code> and save to reload.
      </Intro>
      </Div>
        </Wrapper>
    );
  }
}
export default App;
