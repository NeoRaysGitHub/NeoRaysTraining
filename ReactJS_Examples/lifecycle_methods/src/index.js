import React from 'react';
import ReactDOM from 'react-dom';
import LifeCycleMethods from './Components/LifeCycleMethods'


ReactDOM.render(<LifeCycleMethods />, document.getElementById('root'));
setTimeout(() => {
  ReactDOM.unmountComponentAtNode(document.getElementById('root'))},10000);
