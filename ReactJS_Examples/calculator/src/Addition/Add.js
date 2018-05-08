import React, { Component } from 'react';

class Add extends Component
{
  constructor(props)
  {
    super(props);

      this.state=
      {           n1:" ",
                  n2:" ",
                  result:" "
      }
}
    doAdd = () => {
                this.setState({result : parseInt(this.state.n1) + parseInt(this.state.n2) });
            }

            doSub = () => {
                        this.setState({result : parseInt(this.state.n1) - parseInt(this.state.n2) });
                    }
                    doMul = () => {
                                this.setState({result : parseInt(this.state.n1) * parseInt(this.state.n2) });
                            }
                            doDiv = () => {
                                        this.setState({result : parseInt(this.state.n1) / parseInt(this.state.n2) });
                                    }

render()
{
  var n1=this.state.n1;
  var n2=this.state.n2;

  var myStyle = {
      color: 'red'
   }

}
  return(
    <div style={myStyle}>
    
          Enter number 1:<input type='number' value={this.state.n1}  /><br/> <br/>
          Enter number 2:  <input type='number' value={this.state.n2}   placeholder="enter number 2"/><br/> <br/>
            <input type="button" onClick={this.doAdd} value="Add"/>
            <input type="button" onClick={this.doSub} value="Sub"/>
            <input type="button" onClick={this.doMul} value="Mul"/>
            <input type="button" onClick={this.doDiv} value="Div"/><br/> <br/>
            Result:  <input type='text' value={this.state.result} readonly/>


      </div>
  );
}
}
export default Add;
