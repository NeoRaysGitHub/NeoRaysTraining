import React from 'react';
import Title from "./components/Title";
import Form from "./components/Form";
import Weather from "./components/Weather";

const API_KEY = "5103fbba93a084bb20b4c0e91aba564a";

class App extends React.Component {
  state = {
    temperature: undefined,
      city: undefined,
        country: undefined,
          humidity: undefined,
            description: undefined,
              error: undefined
  }

  getWeather = async (e) => {
    e.preventDefault();
    const city = e.target.elements.city.value;
    const country = e.target.elements.country.value;
    const api_call = await fetch(`http://api.openweathermap.org/data/2.5/weather?q=${city},${country}&appid=${API_KEY}&units=metric`);
    const data = await api_call.json();
  console.log(data);


if(city && country){
    this.setState({
     temperature:data.main.temp,
      city: data.name,
      country: data.sys.country,
      humidity: data.main.humidity,
      description:data.weather[0].description,
      error: ""
    });
  }
  else
  {
  this.setState({
     temperature: undefined,
      city: undefined,
        country: undefined,
          humidity: undefined,
            description: undefined,
              error: "Please Enter The Correct Place!!!"
            });
  }
}

  render() {
    return (

        <div className = "wrapper">
          <div className = "main">


                          <div className = "title-container">
                          <Title />
                          </div>

                              <div className = "form-container">
                              <Form getWeather={this.getWeather}/>
                              <Weather
                              temperature ={this.state.temperature}
                              city ={this.state.city}
                              country ={this.state.country}
                              humidity ={this.state.humidity}
                              description ={this.state.description}
                              error ={this.state.error}
                              />
                              </div>


              </div>
            </div>


    );
  }
}

export default App;
