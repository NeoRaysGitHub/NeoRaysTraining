import React from 'react';
import ReactDom from 'react-dom';
import './index.css';

class TodoList extends React.Component
{
    constructor()
    {
        super();
        this.state={
            names:['Hari','Suresh','Ramesh'],
            age:[100,200,300]
        }
    }
    render(){
        return(
            <div align='center'>
                {
                    this.state.names.map(function(n){
               return <TodoIteam key={n} details ={n}/> 
                    })
                   
                }
                {
                     this.state.age.map(function(a){
                         return <TodoIteam key={a} details ={a}/>

                    })
                }
            </div>
        )
    }
}
class TodoIteam extends React.Component
{
    render(){
        return(
            <div>
            {this.props.details}
            </div>
        )
    }

}
ReactDom.render(<TodoList/>,document.getElementById('root'))