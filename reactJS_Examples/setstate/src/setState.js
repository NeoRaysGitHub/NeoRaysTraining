import React from 'react';

class SetState extends Component{
  constructor(){
    super();
    this.state={
      data:[]
    }
    this.setStateHandler = this.setStateHandler.bind(this);
  };

  setStateHandler(){
    var item="setting state...";
    var itemArray=this.state.data.slice();
    itemArray.push(item);
    this.setState({data:itemArray})
  };

  render(){
    return(
      <div>
      <button onClick={this.setStateHandler}>set state</button>
      <h4> State Array:{this.state.data}</h4>
      </div>
    )
  }
}
export default SetState;
