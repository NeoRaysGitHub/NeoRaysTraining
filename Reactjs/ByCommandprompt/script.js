//var Greeting=React.createClass({
//render:function(){
  //return(
  //  React.createElement('h1',null,'hello,World');
///  );
//
//});

//window.addEventListner('load',function(){
// React.render(React.createElement(Greeting,null),document.body);
//});
/*var Greeting = React.createClass({
  render: function() {
	return (
  React.createElement('h1', null, this.props.name)
);
  }
});*/
var clock=React.createClass({
  render:function(){
    var time=this.props.hour<12 ? 'Morning' : 'AfterNoon';
    return(
      React.createElement(h1,null,time)
    );
  }
});

window.addEventListener('load', function() {
  /*React.render(
    React.createElement(Greeting, null),
    document.body  );
 React.render(  React.createElement(Greeting, { name: 'world' }),
  document.body*/

  var hour=(new Date).getHours();
  React.render(
    React.createElement(
  clock,{hour:hour},document.body

    );
  );
);});
