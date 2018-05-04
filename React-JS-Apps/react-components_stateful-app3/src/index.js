import React from 'react';
import ReactDOM from 'react-dom';

class App extends React.Component
{
    constructor()
    {
        super();
        this.state={
            data:[
                {
                    "id":1,
                    "name":"Hari",
                    "age":"40"
                },
                {
                    "id":2,
                    "name":"Suresh",
                    "age":"50"
                },
                {
                    "id":3,
                    "name":"Bar",
                    "age":"60"
                }

            ]
        }
    }
    render(){
        return(
            <div>
                <Header/>
                <table>
                    <tbody bgcolor="red">
                        <center>
                        {this.state.data.map((person,i)=>
                       < TableRow key={i} data={person}/>

                        )}
                        </center>
                    </tbody>
                </table>
            </div>
        )
    }
}
class Header extends React.Component{
    render(){
        return(
            <div >
                <h2>Header</h2>
            </div>
        )
    }
}
class TableRow extends React.Component
{
    render()
    {
        return(
            <tr>
                <td>{this.props.data.id}</td>
                <td>{this.props.data.name}</td>
                <td>{this.props.data.age}</td>
            </tr>
        )
    }
}
ReactDOM.render(<App/>,document.getElementById('root'));