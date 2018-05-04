import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Addition from './Addition';
//import Duplicate from './duplicate';

import registerServiceWorker from './registerServiceWorker';

ReactDOM.render(<Addition />, document.getElementById('root'));
registerServiceWorker();
