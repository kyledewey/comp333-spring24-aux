function add(x, y) {
    return x + y;
}

function printArray(arr) {
    for (let index = 0; index < arr.length; index++) {
        let elem = arr[index];
        console.log(elem); // prints element
    }
}

function printLessThan7(arr) {
    for (let index = 0; index < arr.length; index++) {
        let elem = arr[index];
        if (elem < 7) {
            console.log(elem); // prints element
        }
    }
}

// FOR WEDNESDAY: evens, HOF
