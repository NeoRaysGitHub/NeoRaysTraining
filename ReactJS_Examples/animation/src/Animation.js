import React from 'react';
var ReactCSSTransitionGroup = require('react-addons-css-transition-group');
class Animation extends React.Component
{
  constructor(props)
  {
    super(props);
    this.state={
      item:['java...', 'jquery...', 'javascript...', 'Reactjs...']
    }
    this.handleAdd=this.handleAdd.bind(this);
  };
  handleAdd()
  {
    var newItem=this.state.item.concat([prompt('create new item')]);
    this.setState({item:newItem});
  }
  handleRemove(i)
  {
    var newItem=this.state.item.slice();
    newItem.splice(i,1);
    this.setState({item:newItem});
  }
  render()
  {
    var item=this.state.item.map(function(item,i)
  {
    return(
      <div key={item} onClick={this.handleRemove.bind(this,i)}>
      {item}
    </div>
  );
}.bind(this));
return(
  <div>
  <button onClick={this.handleAdd}>Add item</button>
  <ReactCSSTransitionGroup transitionName = "example"
               transitionEnterTimeout = {5000} transitionLeaveTimeout = {5000}>
               {item}
            </ReactCSSTransitionGroup>
         </div>
);
  }
}
export default Animation;
