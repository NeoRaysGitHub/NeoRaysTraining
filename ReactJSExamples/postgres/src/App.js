import React, { Component } from 'react';

class App extends Component {
constructor(props){
  super(props);
  this.state = {
    title: 'Simple Country Application',
    countries: []
  }
}
componentDidMount(){
  console.log('Component has mounted');
//  var that = this;

  fetch('http://localhost:3000/api/countries')
  .then(function(response){
    response.json()
    .then(function(data){
      console.log(data);
      this.setState({
        countries: data
      })
      //console.log(response);
    })
  })
}

removeCountry(country_id){
  //console.log(country_id);
  var that = this;
  let countries = this.state.countries;
  let country =  countries.find(function(country){
    return country.country_id === country_id
  });


 var request = new Request('http://localhost:3000/api/remove/:' + country_id,{
   method: 'DELETE',
   headers: new Headers({'Content-Type': 'application/json'}),
   body: JSON.stringify(country),
   });
console.log(request);
 fetch(request)
   .then(function(response){
        countries.splice(countries.indexOf(country,1));
          that.setState({
          countries: countries,
        })
        response.json()
     .then(function(data){
       console.log(this);
       })
   })
}

addCountry(event){
    var that = this;
  event.preventDefault();
let country_data = {
  country_name: this.refs.country_name.value,
  continent_name: this.refs.continent_name.value,
  country_id: Math.random().toFixed(3),

};
var request = new Request('http://localhost:3000/api/new-country',{
  method: 'POST',
  headers: new Headers({'Content-Type': 'application/json'}),
  body: JSON.stringify(country_data),

});
console.log(request);
let countries = that.state.countries;
countries.push(country_data);
that.setState({
  countries: countries
})
//xmlhttprequest()
fetch(request)
  .then(function(response){
  response.json()
  .then(function(data){
    console.log(data);
    })
})
.catch(function(err){
  console.log(err);
})
}

  render() {
    let title = this.state.title;
    let countries = this.state.countries;
    return (
      <div className="App">
        <h1><center>{title}</center></h1>
        <form ref = "countryform">
          <input type ="text" ref="country_name" placeholder="name" />
          <input type ="text" ref="continent_name" placeholder="continent_name" />
          <button onClick={this.addCountry.bind(this)}>Add Country</button>
        </form>
        <ul>
        {countries.map(country =>
          <li key={country.country_id}>{country.country_name} {country.continent_name}
          <button onClick = {this.removeCountry.bind(this,country.country_id)}> Remove</button>
          </li>
        )}
        </ul>
      </div>
    );
  }
}

export default App;
