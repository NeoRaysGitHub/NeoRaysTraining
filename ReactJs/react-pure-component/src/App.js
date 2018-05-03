import React, { Component,PureComponent} from 'react';
import './App.css';

const Temp=(props)=>{
  console.log('render Temp')
  return(
    <div>{props.val}</div>
  )
}

class App extends PureComponent {
  state={
    val:1
  }

  componentDidMount(){
    setInterval(()=>{
      this.setState(()=>{
        return{val:1}
      });
    },2000)
  }

 // shouldComponentUpdate(nextProp,nextState){
  //  console.log('next State', nextState)
  //  console.log('corrent State',this.state)
   // return(this.state.val===nextState.val?false:true)
 // }

  render() {
    console.log('Redring App')
    return (
      <div className="App">
        <Temp val={this.state.val}/>
      </div>
    );
  }
}

export default App;
