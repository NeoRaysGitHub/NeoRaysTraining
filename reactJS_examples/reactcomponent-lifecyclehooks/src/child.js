import React, { Component } from 'react';
import './App.css';
class Child extends Component {
        constructor(){
            super();
            console.log('child constructgor');
                  }
                    componentWillMount(){
                      console.log('child componentWillMount');
                                      }
                                      componentDidMount(){
                                            console.log(' child componentDidMount');
                                    }
    componentWillReceiveProps(){
              console.log('Child componentWillReceiveProps');
                                }
    shouldComponentUpdate(nextProps,nextState){
            console.log('child shouldComponentUpdate');
      //  return true;
        return false;
      }
      compoentwillUpdate(){
        console.log('child componentwillUpdate');
      }
  render() {
      console.log(' child render');
      return (
        <div className="App">
            child name:{this.props.name}
        </div>
          );
          }
}
export default Child;
