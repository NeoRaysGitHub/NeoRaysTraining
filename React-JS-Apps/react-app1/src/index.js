
import React from 'react';
import ReactDOM from 'react-dom';

function Welcome(props) {
    return <div align='center'><h1>Hello, {props.name}</h1></div>;
  }
  
  function App() {
    return (
      <div>
        <Welcome name="Hari" />
        <Welcome name="Suresh" />
        <Welcome name="mithilesh" />
      </div>
    );
  }
  
  ReactDOM.render(<App />, document.getElementById('root'));