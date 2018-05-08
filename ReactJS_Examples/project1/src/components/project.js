import React, { Component } from 'react';
import ProjectItems from './projectItems';

class Project extends Component {
  render() {
          let projectItems;
          if(this.props.project){
            projectItems=this.props.project.map(project =>{
              return(
                <ProjectItems key={project.title} project={project}/>
              );
            });
          }
    return (
      <div className="Project">
     {projectItems}
      </div>
    );
  }
}

export default Project;
