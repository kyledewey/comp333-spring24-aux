// for (int element : arr) {
//   System.out.println(element);
// }
// op: function that takes one parameter
function forEach(arr, op) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        op(element);
    }
}

// op: a function
//    -First param: the current value of retval
//    -Second param: the current element in the array
//    Returns: the new value of retval
// startValue: the starting value of retval
function reduce(arr, op, startValue) {
    let retval = startValue;
    for (let index = 0; index < arr.length; index++) {
        let elem = arr[index];
        retval = op(retval, elem);
    }
    return retval;
}

function sum(arr) {
    return reduce(arr, (retval, elem) => retval + elem, 0);
    // let retval = 0;
    // for (let index = 0; index < arr.length; index++) {
    //     let elem = arr[index];
    //     retval = retval + elem;
    // }
    // return retval;
}

function product(arr) {
    // retval: accumulator
    return reduce(arr, (retval, elem) => retval * elem, 1);
    // let retval = 1;
    // for (let index = 0; index < arr.length; index++) {
    //     let elem = arr[index];
    //     retval = retval * elem;
    // }
    // return retval;
}
