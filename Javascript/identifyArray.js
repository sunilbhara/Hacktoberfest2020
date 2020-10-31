/**
 * Assign a numeric identifier to every element of a sorted array
 * @param {Array} a  An array
 * @return {Array} An array of objects containing the original value and its identifier
 */

function identifyArray(a) {
  if (!Array.isArray(a)) {
    throw new Error("Array input expected");
  }

  if (a.length === 0) {
    return a;
  }

  const b = [];
  let count = 0;
  b[0] = { value: a[0], identifier: 0 };
  for (let i = 1; i < a.length; i++) {
    if (a[i] === a[i - 1]) {
      count++;
    } else {
      count = 0;
    }
    b.push({ value: a[i], identifier: count });
  }
  return b;
}
