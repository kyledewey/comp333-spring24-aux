public class PrintOdds extends PrintSome {
    public boolean condition(final int elem) {
        return elem % 2 != 0;
    }

    public static void main(String[] args) {
        PrintSome some = new PrintOdds();
        some.printSome(new int[]{1, 2, 3, 4, 5});
    }
}
