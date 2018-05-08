import React from 'react';
import ReactDOM from 'react-dom';
import Lifecycle from './component/Lifecycle';

ReactDOM.render(<Lifecycle />, document.getElementById('root'));
setTimeout(()=>{
  ReactDOM.unmountComponentAtNode(document.getElementById('root'));},10000);
