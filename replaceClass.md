---
title: replaceClass
tags: browser,beginner
---

Replace a specific class of an element with another class.

- Element.classList returns a DOMTokenList collection of classes of the element.
- Use replace() method to search for a specified class and return a new value.

```js
const replaceClassName = (myElement, className, newClassName) =>
  myElement.classList.replace(className, newClassName);
```

```js
const myElement = document.getElementById("myElement");
replaceClassName(myElement, 'example', 'my'); 
// 'sampleTarget' <div id="myElement" class="example class list">
// 'sampleOutput' <div id="myElement" class="my class list">
```