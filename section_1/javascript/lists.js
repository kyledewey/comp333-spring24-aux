// for (int element : arr) {
//   System.out.println(element);
// }
function forEach(arr, op) {
    for (let index = 0; index < arr.length; index++) {
        let element = arr[index];
        op(element);
    }
}

// TODO: foreach again, map, filter
