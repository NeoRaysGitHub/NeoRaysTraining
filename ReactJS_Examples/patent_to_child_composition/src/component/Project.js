import React from 'react';

class Project extends React.Component {
   render() {

      return (
         <div>
            <Header/>
            <Content/>
         </div>
      );
   }
}
class Header extends React.Component {
   render() {
     var myStyle = {
         fontSize: 100,
         color: 'red'
      }
      return (
         <div>
            <h1  style = {myStyle}>Header</h1>
         </div>
      );
   }
}
class Content extends React.Component {
   render() {
     var myStyle = {
         fontSize: 50,
         color: 'green'
      }
      return (
         <div>
            <h2 style = {myStyle}>Content</h2>
            <p>The content text!!!</p>
         </div>
      );
   }
}
export default Project;
