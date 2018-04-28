import React, { Component } from 'react';

class ProjectsItem extends Component {
deleteProject(id){
  this.props.onDelete(id);
}

  render() {
    return (
      <li className="Projects">
        <strong>{this.props.project.title}</strong> : {this.props.project.category}<a href="#" onClick={this.deleteProject.bind(this,this.props.project.id)}>x</a>;
      </li>
    );
  }
}

export default ProjectsItem;
