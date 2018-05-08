import React, { Component } from 'react';

class Addproject extends Component {
  constructor(){
    super();
    this.state={
      newProject:{}
    }
  }
  static defaultProps ={
    categories:['web design', 'web development', 'mobile development']
  }
handleSubmit(e){

  console.log(this.refs.title.value);
  e.preventDefault();
}
  render() {
    let categoryOptions = this.props.categories.map(category => {
      return <option key={category} value="category">{category}</option>
    })
    return (
      <div>
        <h3> Add project</h3>
        <form onSubmit={this.handleSubmit.bind(this)}>
        <div>
          <label>Title</label>
          <input type="text"  ref="title" />
      </div>
      <div>
        <label>category</label><br/>
        <select ref="category">
        {categoryOptions}
        </select>
        </div>
        <input type="submit" value="Submit" />
        </form>
        </div>
    );
  }
}

export default Addproject;
