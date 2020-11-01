function getLinksFromMd(text) {

  if (text === undefined) {
    throw new Error('No text');
  } else if (typeof text === 'number') {
    throw new Error('Insert a text');
  }

  const regex = new RegExp(/\[(.+?)\]\((.*?)\)/g);
  let links = [];
  let myArray = [];

  while ((myArray = regex.exec(text)) !== null) {
    let obj = {
      href: myArray[2],
      text: myArray[1]
    };
    links.push(obj);
  }
  return links;
}

module.exports.getLinksFromMd = getLinksFromMd;
