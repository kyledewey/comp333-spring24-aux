// -higher-order functions
// -anonymous functions
// -lambda functions / lambdas
// -closures
// higher-order functions: functions are data
function printSome(arr, condition) {
    // condition: function that takes an element (int),
    // returns a boolean (true if we want to print it)
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        if (condition(element)) { // calls condition
            console.log(element); // prints something
        }
    }
}

function printAll(arr) {
    printSome(arr, (e) => true);
}

function printAllLessThan7(arr) {
    let f = (element) => element < 7;
    printSome(arr, f); // ??
}

function printAllEvens(arr) {
    printSome(arr, (e) => e % 2 === 0);
}

function printAllOdds(a) {
    let f = function (e) {
        console.log("ELEMENT: " + e);
        return e % 2 !== 0;
    };
    printSome(a, f);
}

function delayedAdd(x) {
    return function (y) {
        return x + y;
    };
}

