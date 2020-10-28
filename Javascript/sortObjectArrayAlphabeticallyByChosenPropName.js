const sortObjectArrayAlphabeticallyByChosenPropName = (array, property) => {
    array.sort((a, b) => {
        const propertyA = a[property].toUpperCase();
        const propertyB = b[property].toUpperCase();
        return (propertyA < propertyB) ? -1 : (propertyA > propertyB) ? 1 : 0;
    });
    return array;
}
