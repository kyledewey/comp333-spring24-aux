function printAll(arr) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        console.log(element); // prints something
    }
}

function add(x, y) {
    return x + y;
}

function printAllLessThan7(arr) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        if (element < 7) {
            console.log(element);
        }
    }
}

function printAllEvens(arr) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        if (element % 2 === 0) {
            console.log(element);
        }
    }
}

// FOR NEXT TIME: remove code duplication
