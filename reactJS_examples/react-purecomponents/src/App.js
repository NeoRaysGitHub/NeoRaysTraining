import React, { Component } from 'react';
import './App.css';
const Temp =(props)=>{
      console.log('render temp');
  return (<div>{props.val}</div>)
}
class App extends Component {
  state={
    val:Math.random();
  }
    componentDidMount(){
      setInterval(()=>{
        this.setState(()=>{
          return {val:Math.random()}
        });
      },2000)
    }
shouldComponentUpdate(nextProp,nextState){
console.log('nextState', nextState);
console.log('currentState',this.state)
  return(this.state.this===nextState.value?false:true)
}

  render() {
    console.log('render App');

    return (
      <div className="App">
      <Temp val={this.state.val}/>
      </div>
    );
  }
}

export default App;
