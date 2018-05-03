import React, { Component } from 'react';
//import TextField from 'material-ui/TextField';
//import RaiseButton from 'material-ui/RaiseButton';
import './App.css';

class App extends Component {

  constructor(props) {
    super(props);
    this.state = { name: '',
                  nameError:'',
                   age:'',
                   ageError:''
                 }
   
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({ [event.target.name]: event.target.value });

  }

  validet=()=>{

    let isError=false;
    const errors={};
    if(this.state.name.length <5){
      isError=true;
      errors.nameError='Name is requare';
    }

    if(isError){
      this.setState({
        //...this.state,
        //...errors
        nameError: 'Name is requare'
      });
    }
    return isError;
  }

  handleSubmit(event) {
    const err=this.validet();
    if(!err){
    alert('A name was submitted: ' + this.state.name + '-' + this.state.age);
    event.preventDefault();
    }else{
      alert(''+this.state.nameError);
    }
  }

  render() {
    return (
      <div className='App'>
        <form onSubmit={this.handleSubmit}>
          <br />
          Name:
        <input type='text' name='name'  value={this.state.name} onChange={ this.handleChange} />
          <br /><br />
          Age:
        <input type='text' name='age'  value={this.state.age} onChange={this.handleChange} />
          <br /><br />
          <input type='submit' value='Submit' />
        </form>
      </div>
    );
  }
}

export default App;
