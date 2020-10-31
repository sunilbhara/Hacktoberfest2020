/**
 * toFraction
 *
 * Returns a [numerator, denominator] array rational representation
 * of `decimal`
 *
 * See http://en.wikipedia.org/wiki/Continued_fraction for implementation
 * details
 *
 * toFraction(4/8) => [1, 2]
 * toFraction(0.66) => [33, 50]
 * toFraction(0.66, 0.01) => [2/3]
 * toFraction(283 + 1/3) => [850, 3]
 */

function numberToFraction(decimal, tolerance, max_denominator) {
  max_denominator = max_denominator || 1000;
  tolerance = tolerance || EPSILON; // can't be 0

  // Initialize everything to compute successive terms of
  // continued-fraction approximations via recurrence relation
  var n = [1, 0],
    d = [0, 1];
  var a = Math.floor(decimal),
    t;
  var rem = decimal - a;

  while (d[0] <= max_denominator) {
    if (knumber.equal(n[0] / d[0], decimal, tolerance)) {
      return [n[0], d[0]];
    }
    n = [a * n[0] + n[1], n[0]];
    d = [a * d[0] + d[1], d[0]];
    a = Math.floor(1 / rem);
    rem = 1 / rem - a;
  }

  // We failed to find a nice rational representation,
  // so return an irrational "fraction"
  return [decimal, 1];
}
