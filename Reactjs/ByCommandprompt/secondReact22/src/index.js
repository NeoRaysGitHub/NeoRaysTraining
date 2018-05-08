import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import registerServiceWorker from './registerServiceWorker';

/*var obj={
  myFavourite:0
};   */

ReactDOM.render(
  <div>
  <App name="Earth" />

</div>,
 document.getElementById('root'));
registerServiceWorker();
