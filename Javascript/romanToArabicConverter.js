const decimal = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1];

const roman = ['M', 'CM','D','CD','C', 'XC', 'L', 'XL', 'X','IX','V','IV','I'];

function romanToInt(str) {
  let regex = new RegExp(/^[MDCLXVI)(]+$/);

  if (str === undefined) {
    throw new Error('Texto não fornecido');
  } else if (!regex.test(str))  {
    throw new Error('Caractere inválido');
  }

  let result = 0;

  for (let i = 0; i <= decimal.length; i++) {
    while (str.indexOf(roman[i]) === 0){
      result += decimal[i];
      str = str.replace(roman[i],'');
    }
  }

  return result;
}

module.exports.romanToInt = romanToInt;

