function forEach(arr, operation) {
    for (let index = 0; index < arr.length; index++) {
        let elem = arr[index];
        operation(elem);
    }
}

// FOR NEXT TIME: other operations (map, filter, reduce)
