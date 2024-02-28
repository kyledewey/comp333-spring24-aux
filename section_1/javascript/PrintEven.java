public class PrintEven extends PrintSome {
    public boolean shouldPrint(final int element) {
        return element % 2 == 0;
    }
}
