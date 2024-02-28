public class PrintLessThan7 extends PrintSome {
    public boolean shouldPrint(final int element) {
        return element < 7;
    }

    public static void main(String[] args) {
        PrintSome some = new PrintLessThan7();
        some.printSome(new int[]{8, 2, 3, 8, 9, 4, 5});
    }
}
