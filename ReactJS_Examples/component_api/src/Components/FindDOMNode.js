import React from 'react';
import ReactDOM from 'react-dom';

class FindDOMNode extends React.Component{
  constructor(){
    super();
    this.findDOMNodeHandler=this.findDOMNodeHandler.bind(this);
  };
  findDOMNodeHandler(){
    var myDiv=document.getElementById('myDiv');
    ReactDOM.findDOMNode(myDiv).style.color='red';
  }
  render(){
    return(
      <div>
        <button onClick={this.findDOMNodeHandler}>Find DOM Node</button>
        <div id='myDiv'>NODE</div>
      </div>
    );
  }
}
export default FindDOMNode;