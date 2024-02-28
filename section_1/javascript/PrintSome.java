public abstract class PrintSome {
    public void printSome(final int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            final int element = arr[index];
            if (shouldPrint(element)) {
                System.out.println(element);
            }
        }
    }

    public abstract boolean shouldPrint(final int element);
}
