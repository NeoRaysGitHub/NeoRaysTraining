var React=require('react');
var createReactClass = require('create-react-class');
var HelloWorld=createReactClass({
  render:function(){
    return(
        React.createElement('div',null,
        React.createElement('h1',null,'Hello World'),
        React.createElement('p',null,'welcome!!!'),
        React.createElement('div',null,'hai'),
        React.createElement('h4',null,'This is new world of React')
      )
  );
  }
});
//ReactDOM.render(React.createElement(HelloWorld,null),document.body);
export default HelloWorld;
