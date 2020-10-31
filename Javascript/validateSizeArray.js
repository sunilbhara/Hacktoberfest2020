/**
 * Validate whether each element in a multi dimensional array has
 * a size corresponding to the provided size array.
 * @param {Array} array    Array to be validated
 * @param {number[]} size  Array with the size of each dimension
 * @throws DimensionError
 */
function validateSizeArray(array, size) {
  const isScalar = size.length === 0;
  if (isScalar) {
    // scalar
    if (Array.isArray(array)) {
      throw new Error();
    }
  } else {
    // array
    _validateSizeArray(array, size, 0);
  }
}

/**
 * Recursively validate whether each element in a multi dimensional array
 * has a size corresponding to the provided size array.
 * @param {Array} array    Array to be validated
 * @param {number[]} size  Array with the size of each dimension
 * @param {number} dim   Current dimension
 * @throws DimensionError
 * @private
 */
function _validateSizeArray(array, size, dim) {
  let i;
  const len = array.length;

  if (len !== size[dim]) {
    throw new Error();
  }

  if (dim < size.length - 1) {
    // recursively validate each child array
    const dimNext = dim + 1;
    for (i = 0; i < len; i++) {
      const child = array[i];
      if (!Array.isArray(child)) {
        throw new Error();
      }
      _validateSizeArray(array[i], size, dimNext);
    }
  } else {
    // last dimension. none of the childs may be an array
    for (i = 0; i < len; i++) {
      if (Array.isArray(array[i])) {
        throw new Error();
      }
    }
  }
}
