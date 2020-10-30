const appendItems = (array) => {
  array.forEach((item) => {
  var node = document.createElement("li");
  var textnode = document.createTextNode(item)
  node.appendChild(textnode);
  document.getElementById("shopping-cart").appendChild(node);
  console.log(item)
})}

appendItems(["milk", "bread", "butter", "chocolate", "cream"]);
appendItems(["wheat", "rice", "juice", "cashews"]);

const add = () => {

    inputEl = document.getElementById("input-text");
    if (inputEl.value !== "") {
      var node = document.createElement("li");
      var textnode = document.createTextNode(inputEl.value)
      node.appendChild(textnode);
      document.getElementById("shopping-cart").appendChild(node);
      inputEl.value = ""
    }
   else {
     alert("You have to enter something to add it!")
   }
}