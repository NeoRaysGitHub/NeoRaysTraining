import React, { Component } from 'react';
import logo from './logo.svg';
import Output from './controller/Output';
import axios from 'axios';

class App extends Component {
constructor(props){
  super(props);
  this.state={
    paras:4,
    html:true,
    text:""
  }
}

componentWillMount(){
  this.getSampleText();
}
getSampleText(){
  console.log(this.state.paras);
    console.log(this.state.html);

  axios.get('https://raw.githubusercontent.com/Deepashree1508/my-files/master/kaveri.txt?paras='+this.state.paras+'&html='+this.state.html)
  .then((response)=>{
    this.setState({text: response.data.text}, function(){
      console.log(this.state);
    })
  })
    .catch((err)=>{
     console.log(err);
   });
}

  render() {
    return (
      <div className="App">
      hello
    <Output value={this.state.text}/>
      </div>
    );
  }
}

export default App;
