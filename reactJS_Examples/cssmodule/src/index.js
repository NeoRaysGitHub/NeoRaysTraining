import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import CommentBox from './App';
import registerServiceWorker from './registerServiceWorker';

ReactDOM.render(<CommentBox attribute={["johnsons","baby","powder"]} />, document.getElementById('root'));

/*ReactDOM.render(<CommentBox attribute={{one:"johnsons",two:"baby",three:"powder"}} />, document.getElementById('root'));
*/
registerServiceWorker();
