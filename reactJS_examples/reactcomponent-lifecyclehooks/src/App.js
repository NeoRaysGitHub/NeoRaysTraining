import React, { Component } from 'react';
import './App.css';
import Child from './child';
class App extends Component {
state={
  name:'chiru'
}
constructor(){
  super();
  this.state={
    name:'bharathkumar reddy'
  };
  console.log('constructgor');

}
componentWillMount(){
  if(window.innerWidth<500){
    this.setState({innerWidth:window.innerWidth});
  }
console.log('componentWillMount');
}
    componentDidMount(){
        console.log('componentDidMount');
                      }

      componentWillReceiveProps(){
    console.log(' componentWillReceiveProps');
        }
  changeState(){
    this.setState({name:'rokesh'});
  }
  shouldComponentUpdate(nextProps,nextState){
      console.log(' shouldComponentUpdate');
    return true;
  }
  compoentwillUpdate(){
    console.log('componentwillUpdate');
  }

  render() {
        console.log('render');
        return (
      <div className="App">
      name:{this.state.name}
      <br/>
        innerWidth:{this.state.innerWidth}
        <Child name={this.state.name}/>
        <button onClick={this.changeState.bind(this)}>Change state</button>
      </div>
          );
          }
}

export default App;
