import React, { Component } from 'react';
import Props from './components/Props';
import Projects from './components/Projects';
//import ProjectItem from './components/ProjectItem';
import AddProject from './components/AddProject';

import './App.css';


class App extends Component {
  constructor(){
    super();
    this.state = {
      projects:[]
    }
  }

  componentWillMount(){
    this.setState({projects:[
      {
        title:'business website',
        category:'web design'
      },
      {
        title:'software development',
        category:'webpage design'
      },
      {
        title:'Social App',
        category:'Android'
      }
    ]
  })
  }

handleAddProject(project){
  let projects=this.state.projects;
  projects.push(project);
  this.setState({projects:projects});
}


  render() {
    return (
      <div className="App">
    <Props test="Hello world" demo="Demo"/>

<Projects projects={this.state.projects}/>
<br/>
<AddProject addProject={this.handleAddProject.bind(this)}/>
      </div>
    );
  }
}

export default App;
