import React from 'react';

 class ToDoAppList extends Component {
      constructor(props){
        super(props);
             };
       render() {
    return (
               <ul>
               <li>Task1</li>
               <li>Task2</li>
               <li>Task3</li>
               <li>Task4</li>
              </ul>

          /*<form onSubmit={}>
              <input type="text"/>
          </form>*/
    );
  }
}

export default ToDoAppList;
