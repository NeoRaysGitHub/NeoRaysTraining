import React, { Component,Fragment} from 'react';
import './App.css';
const Temp=()=>{
  return(
//<div>
//[
    <Fragment>
    <div key="1">hai</div>
      <div key="2">Hello</div>
      </Fragment>

  //  ]
//</div>
    )
}
class App extends Component {
  render() {
    return (
      <div className="App">
      <Temp/>
      </div>
    );
  }
}

export default App;
