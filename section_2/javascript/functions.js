// functional programming: programming paradigm
//
// -higher-order function
// -anonymous function
// -lambda function / lambdas
// -closures
//
// Higher-order function: functions are data
function add(x, y) {
    return x + y;
}

// general issue: we want to pass a computation as a parameter
function printSome(arr, condition) {
    for (let index = 0; index < arr.length; index++) {
        let elem = arr[index];
        if (condition(elem)) { // condition uses elem
            console.log(elem); // prints element
        }
    }
}

function printAll(arr) {
    // let f = (e) => true;
    let f = function (e) {
        return true;
    };
    printSome(arr, f);
}

// function lessThan7(elem) {
lessThan7 = function (elem) {
    console.log("ELEMENT: " + elem);
    return elem < 7;
}

function printLessThan7(arr) {
    printSome(arr, lessThan7);
}

function printEvens(arr) {
    // ==, !=
    // ===, !==
    printSome(arr, (elem) => elem % 2 === 0);
}

function printOdds(arr) {
    printSome(arr, (elem) => elem % 2 !== 0);
}

function delayedAdd(x) {
    return function (y) {
        return x + y;
    };
}

    
