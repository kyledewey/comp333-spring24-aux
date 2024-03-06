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

// function foo() {}

// def callMe(foo: () => Unit): Unit = {
//   foo()
// }

function foo() {
    console.log("FOO CALLED");
}

function callMe(foo) {
    return foo();
}

// let callMe = (foo) => foo();

function indirectIf(bool, func1, func2) {
    // (bool) ? func1() : func2();
    if (bool === true) {
        func1();
    } else {
        func2();
    }
}

// f1: (???) => bool
// f2: (???) => undefined
function indirectWhile(condition, body) {
    if (condition() == true) {
        body();
        indirectWhile(condition, body);
    }
}

function returnParam(param) { return param; }

// wrapAdd is a function that takes two arguments
//   -first argument: function
//      -Takes one argument
//      -Returns the passed argument
//   -second argument: integer
//   -returns a function:
//      -Takes one argument: an integer
//      -Returns an integer
//
// func wrapAdd(a: (A) -> A, b: int): (int) -> int

// let f = wrapAdd(returnParam, 5);
// let x = f(2); // x = 7
// let y = f(3); // y = 8

function wrapAdd(func, integer) {
    return function (otherInteger) {
        // doesn't use func
        let add = integer + otherInteger;
        return func(add);
    }
}
    
