public abstract class PrintSome {
    public void printSome(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            int elem = arr[index];
            if (condition(elem)) {
                System.out.println(elem);
            }
        }
    }

    public abstract boolean condition(final int elem);
}
