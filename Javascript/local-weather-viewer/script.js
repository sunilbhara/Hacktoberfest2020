let latitude = 0,
  longitude = 0;

const app = new Vue({
  el: "#app",
  data: {
    weather: {
      temperature: 0,
      windSpeed: 0,
    },
    metric: true,
  },
  created() {
    if (navigator.geolocation) {
      navigator.geolocation.getCurrentPosition((position) => {
        latitude = position.coords.latitude;
        longitude = position.coords.longitude;

        this.getWeather();
      });
    } else {
      console.log("This browser doesn't support geolocation.");
    }
  },
  methods: {
    getWeather: async function () {
      try {
        const url = `https://fcc-weather-api.glitch.me/api/current?lat=${latitude}&lon=${longitude}`;

        let response = await fetch(url);

        if (response.ok) {
          let jsonResponse = await response.json();

          this.weather.alt = jsonResponse.weather[0].main;
          this.weather.description = jsonResponse.weather[0].description;
          this.weather.icon = jsonResponse.weather[0].icon;
          this.weather.temperature = jsonResponse.main.temp;
          this.weather.windSpeed = jsonResponse.wind.speed;
          this.weather.country = jsonResponse.sys.country;
          this.weather.area = jsonResponse.name;
        }
      } catch (error) {
        console.log(error);
      }
    },
  },
  computed: {
    imperialTemp() {
      return Number(((this.weather.temperature * 9) / 5 + 32).toFixed(2));
    },
    imperialWindSpeed() {
      return Number((this.weather.windSpeed * 1.943844).toFixed(2));
    },
  },
});
