// operation: a function that takes one parameter
function forEach(arr, operation) {
    for (let index = 0; index < arr.length; index++) {
        let elem = arr[index];
        operation(elem);
    }
}

// operation: function that:
//    -Takes the current value of retval
//    -Takes the current array element
//    Returns the new value of retval
// startValue: starting value of retval
function reduce(arr, operation, startValue) {
    // retval: accumulator
    let retval = startValue;
    for (let index = 0; index < arr.length; index++) {
        let elem = arr[index];
        retval = operation(retval, elem);
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
    return reduce(arr, (retval, elem) => retval * elem, 1);
    // let retval = 1;
    // for (let index = 0; index < arr.length; index++) {
    //     let elem = arr[index];
    //     retval = retval * elem;
    // }
    // return retval;
}

function min(x, y) {
    if (x < y) {
	return x;
    } else {
	return y;
    }
}

function findMin(arr) {
    let currentMin = 0;
    for (let index = 0; index < arr.length; index++) {
	let elem = arr[index];
	if (elem < currentMin) {
	    currentMin = elem;
	} else {
	    currentMin = currentMin;
	}
    }
    return currentMin;
}
