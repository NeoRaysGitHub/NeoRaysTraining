import React, { Component } from 'react';

class ProjectItem extends Component {

  render() {
    return (
  //  <h3>  In ProjectItem clas returning listof projectItems</h3>
     <li className="ProjectItem">

  { /*{this.props.project11.title} - {this.props.project11.category}*/}


     <strong>{this.props.project11.title}</strong> - {this.props.project11.category}
<br/>
<br/>
      </li>


   );

  }
}

export default ProjectItem;
