import React, { Component } from 'react';
import GoogleMapReact from 'google-map-react';
import './App.css';
import Flat from './components/Flat';
import Marker from './components/marker';
import $ from 'jquery';
import json from './components/flat.json';

class App extends Component {
    constructor(props){
      super(props);
      this.state = {
        flats: [],
        allFlats: [],
        selectedFlat: null,
        search: "",

      };
    }

componentDidMount(){
  const url = "https://raw.githubusercontent.com/Deepashree1508/my-files/master/flat/places.json";
//const url = $.getJSON("./components/flat.json", function(jsn) {
  // console.log(jsn); // this will show the info it in firebug console
//});
  //console.log(url);
  fetch(url)
  .then(response => response.json())
   .then((data) => {
    this.setState({
      flats: data,
      allFlats: data
    });
  })
}

handleSearch = (event) =>{
  this.setState({
    search: event.target.value,
    flats: this.state.allFlats.filter((flat) => new RegExp(event.target.value ,"i").exec(flat.name))
  });
}

selectFlat = (flat) => {
  this.setState({
    selectedFlat : flat
  });
}

  render() {
//const flats =[flat ,flat , flat , flat];
//const center = {
//  lat:48.8566,
  //lng:2.3522
//}
  let center = {
    lat:12.9716,
    lng:77.5946
  }

  if(this.state.selectedFlat){
    center={
      lat: this.state.selectedFlat.lat,
      lng: this.state.selectedFlat.lng
    }
  }

    return (
      <div className="app">
        <div className="main">

              <div className="search">
              <input type="text"
                  placeholder="search..."
                  value={this.state.serach}
                  onChange={this.handleSearch} />
                </div>

                <div className="flats">
                  {this.state.flats.map((flat) =>{
                    return <Flat
                     key={flat.name}
                     flat = {flat}
                     selectFlat = {this.selectFlat} />
                  })}
                  </div>

               </div>

              <div className="map">
                <GoogleMapReact  center = {center}  zoom = {13} >
                  {this.state.flats.map((flat) =>{
                    return <Marker
                     key={flat.name}
                      lat = {flat.lat}
                       lng = {flat.lng}
                       text ={flat.price}
                       selected={flat === this.state.selectedFlat} />
                    })}
                  </GoogleMapReact>
             </div>

         </div>
      );
    }
}

export default App;
