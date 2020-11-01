/**
 * Returns a random whole number between min and max
 *
 * @param {number} min The minimum value
 * @param {number} max The maximum value
 * @returns {number}
 */

function numberRandom(min, max) {
  return Math.floor(Math.random() * (max - min + 1) + min);
}
