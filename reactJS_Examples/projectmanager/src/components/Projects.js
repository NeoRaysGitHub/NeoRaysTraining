import React, { Component } from 'react';
import ProjectItem from './ProjectItem';

class Projects extends Component {
  render() {
    let projectItems;
   if(this.props.projects){
    projectItems=this.props.projects.map(project => {
       //console.log(project);
       return(
          <ProjectItem key={project.title} project11={project}/>
       );
    });
}

    return (
      <div className="Projects">

      <h3>In Projects class in return statement</h3>

      {projectItems}

      </div>

    );
  }
}

export default Projects;
