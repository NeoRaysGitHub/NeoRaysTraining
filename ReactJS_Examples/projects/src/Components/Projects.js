import React, { Component } from 'react';
import ProjectsItem from './ProjectsItem';

class Projects extends Component {
  deleteProject(id){
    this.props.onDelete(id);
  }
  render() {
    let projectsItems;
    if(this.props.projects){
        projectsItems=this.props.projects.map(project =>{
          return(
            <ProjectsItem onDelete={this.deleteProject.bind(this)} key={project.title} project={project}>{project}</ProjectsItem>
          )  ;
        });
    }
    return (
      <div className="Projects">
        <h3>Latest Projects</h3>
        {projectsItems}
      </div>
    );
  }
}

export default Projects;
