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
function indirectWhile(fn1, fn2) {
    let bool = fn1();
    if (bool === true) {
        fn2();
        indirectWhile(fn1, fn2);
    }
}

// FOR NEXT TIME: finish indirectWhile questions, #4
