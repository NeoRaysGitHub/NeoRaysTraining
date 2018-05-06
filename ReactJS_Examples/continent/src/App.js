import React, { Component } from 'react';

class App extends Component {

constructor(){
  super();
  this.state={
    title: 'Simple Country Application',
    countries: []
  }
}

componentDidMount(){
console.log('COMPONENT HAS MOUNTED');
  var that=this;
  fetch('http://localhost:3000/countries/country')
  .then(function(response){
    response.json()
      .then(function(data){
        that.setState({
          countries:data
        });
      });
  });
}
removeCountry(id){
  var that=this;
  let countries=this.state.countries;
  let country=countries.find(function(country){
    return country.id===id;
  });

  var request=new Request('http://localhost:countries/remove/'+id, {
    method:'DELETE'
  });
  fetch(request)
    .then(function(response){
      countries.splice(country,1);
      that.setState({
        countries:countries
      });
      response.json()
        .then(function(data){
          console.log(this);
        });
    });
}

addCountry(event){
  var that=this;
  event.preventDefault();
  let country_data={
    country_name:this.refs.country_name.value,
    continent_name:this.refs.continent_name.value,
    id:Math.random().toFixed(3)
  };
  var request=new Request('http://localhost:3000/countries/new-country',{
    method:'POST',
    headers:new Headers({'Content-type':'application/json'}),
    body:JSON.stringify(country_data)
  });
  let countries=that.state.countries;
    countries.push(country_data);
    console.log(countries);
    that.setState({
    countries:countries
  });
  fetch(request)
    .then(function(response) {
      response.json()
        .then(function(data){
        });
    })
    .catch(function(err){
      console.log(err);
    });
}
  render() {
    let title=this.state.title;
    let countries=this.state.countries;
    return (
      <div className="App">
        <h1>{title}</h1>
        <h3>Hai Everyone</h3>
        <form ref="countryForm">
          <input type="text" ref="country_name" placeholder="country name"/>
          <input type="text" ref="continent_name" placeholder="continent name"/>
          <button onClick={this.addCountry.bind(this)}>Add Country</button>
        </form>
        <ul>
          {countries.map(country=><li key={country.id}>{country.country_name}{country.continent_name}<button onClick={this.removeCountry.bind(this,country.id)}>Remove</button></li>)}
        </ul>
      </div>
    );
}
}
export default App;
