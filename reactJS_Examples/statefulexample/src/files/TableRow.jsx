import React from 'react';

class TableRow extends React.Component{
  render(){
    return(
      <tr>
        <td>{this.props.data1.id}</td>
        <td>{this.props.data1.name}</td>
        <td>{this.props.data1.age}</td>
      </tr>
    );
  }
}
export default TableRow;
