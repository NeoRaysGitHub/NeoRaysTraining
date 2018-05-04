import React, { Component } from 'react';


class AddProject extends Component {

  constructor(){
    super();
    this.state = {
      newProject:{}
    }
  }

static defaultProps = {
  categories:["select category", "web design", "webpage design", "Android"]
}

handleSubmit(e){
  if(this.refs.title.value ===''){
  alert('Title is required');
  }
  else {
      this.setState({newProject:{
        title:this.refs.title.value,
        category:this.refs.category.value
      }}, function(){
        /*console.log(this.state);*/
        <br/>
        this.props.addProject(this.state.newProject);
      });
    }


  /*console.log("submitted");*/
  e.preventDefault();
}

/*handleSubmit(){
  console.log("submitted");

}*/

  render() {
    let categoryOptions=this.props.categories.map(category =>{
      return <option key={category} value={category}>{category}</option>
    });
    return(
         <div className="AddProject">
          <h3>Add Project</h3>
          <form /*onSubmit={this.handleSubmit} if used type="submit"*/>
            <div>
              <label>Title</label><br/>
              <input type="text" ref="title" />
            </div>
            <div>
              <label>Category</label><br/>
              <select ref="category" >
              {categoryOptions}
              </select>
            </div>
            <br/>
          <input type="button"  value="Submit" onClick={this.handleSubmit.bind(this)}/>
          </form>
         </div>

       );
  }
}

export default AddProject;
