import React, { Component } from 'react';
import Project from './components/project';
import Addproject from './components/Addproject';
class App extends Component{
                constructor(){
                super();
                this.state={
                  project:[]
                }
              }
              componentWillMount(){
                this.setState({projects:[
                  {
                      title:'business website',
                      category:'web Design'
                    },
                    {
                      title:'social App',
                      category:'mobile development'
                    },
                    {
                      title:'Economic shopping cart',
                      category:'web development'
                    }
                  ]});
              }
              render() {
                return (
                  <div className="App">
                  <Addproject/>
                    <h3>Latest Projects</h3>
                    <Project project={this.state.project}/>
                  </div>
                );
              }
          }
export default App;
