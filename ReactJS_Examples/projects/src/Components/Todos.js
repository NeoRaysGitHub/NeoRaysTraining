import React, { Component } from 'react';
import TodoItems from './TodoItems';

class Todos extends Component {

  render() {
    let todoItems;
    if(this.props.todos){
        todoItems=this.props.todos.map(todo =>{
          return(
            <TodoItems key={todo.title} todo={todo}/>
          )  ;
        });
    }
    return (
      <div className="Todos">
        <h3>Todo List</h3>
        {todoItems}
      </div>
    );
  }
}

export default Todos;
