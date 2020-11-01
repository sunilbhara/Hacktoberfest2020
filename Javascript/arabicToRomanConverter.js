const decimal = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1];

const roman = ['M', 'CM','D','CD','C', 'XC', 'L', 'XL', 'X','IX','V','IV','I'];

function intToRoman(num) {
  if (num === undefined || typeof num !== 'number') {
    throw new Error('Number not found');
  } else if (num <= 0 || num > 3999) {
    throw new Error('Invalid Number');
  }

  let result = '';

  for (let i = 0; i <= decimal.length; i++) {
    while (num % decimal[i] < num) {
      result += roman[i];
      num -= decimal[i];
    }
  }
  return result;
}

module.exports.intToRoman = intToRoman;
