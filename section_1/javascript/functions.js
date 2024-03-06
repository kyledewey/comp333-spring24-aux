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

function example(x) {
    // return (x) => (y) => (z) => x + y + z;
    // return (x) => ((y) => ((z) => x + y + z));
    return function (y) {
        return function (z) {
            return x + y + z;
        }
    }
}

function callMe(foo) {
    return foo();
}

// let callMe = (foo) => foo();

function indirectIf(someBool, f1, f2) {
    // (someBool) ? f1() : f2()
    if (someBool) {
        f1();
    } else {
        f2();
    }
}

// let indirectIf =
//     (someBool, f1, f2) => (someBool) ? f1() : f2();

// if (condition) {
//     executeThis();
// } else {
//     executeThat();
// }

// indirectIf(condition, executeThis, executeThat)

// if (condition) {
//     foo();
//     bar();
// } else {
//     baz();
//     blah();
// }

// indirectIf(condition,
//            () => {
//                foo();
//                bar();
//            },
//            () => {
//                baz();
//                blah();
//            })

// def indirectWhile(fn1: () => Boolean, fn2: () => Unit): Unit = {
//   
function indirectWhile(condition, body) {
    let bool = condition();
    if (bool === true) {
        body();
        indirectWhile(condition, body);
    }
}

// (x) => x
returnParam = function (param) { return param; }
// function returnParam(param) { return param; }

// wrapAdd is a function
//   -first parameter: function
//     -Takes something
//     -Returns same something
//   -second parameter: integer
//   -returns a function
//     -Takes an integer
//     -Returns an integer
// let f = wrapAdd(returnParam, 5);
// let x = f(2); // otherInteger = 2; x = 7; 7
// let y = f(3); // otherInteger = 3; y = 8; 8

// func: (A) -> A
// integer: int
// return value: (int) -> int
function wrapAdd(func, integer) {
    // otherInteger: int
    return function (otherInteger) {
        // weird: didn't use func
        let add = integer + otherInteger;
        return func(add);
    }
}

let DEBUG_MODE = false;
function debug(makeMessage) {
    if (DEBUG_MODE) {
        console.log(makeMessage());
    }
}

debug(() => "DEBUG: " + someExpensiveOperation())
