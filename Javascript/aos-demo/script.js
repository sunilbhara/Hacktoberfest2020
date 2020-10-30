AOS.init();

const app = new Vue({
  el: "#app",
  data: {
    img: ["Animals", "Arch", "Nature", "People", "Tech"],
  },
  methods: {
    getImg(name) {
      return "https://placeimg.com/400/225/" + name.toLowerCase();
    },
  },
});
