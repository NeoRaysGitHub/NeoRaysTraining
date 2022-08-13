import React from 'react';

export class ToDo extends React.Component {
  constructor() {
    super();
  }
  render(){
    return(
      <div>
      <h1>ToDO AppList</h1>
      <AddNewTask/>
      <AppList/>
      </div>
    );
  };
}
