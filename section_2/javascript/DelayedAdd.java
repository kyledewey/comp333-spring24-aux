public class DelayedAdd {
    public static DelayedAddRetval delayedAdd(final int x) {
        return new DelayedAddRetval(x);
    }

    public static void main(String[] args) {
        final DelayedAddRetval f1 = delayedAdd(4);
        final DelayedAddRetval f2 = delayedAdd(5);
        System.out.println(f1.add(2));
        System.out.println(f2.add(3));
    }
}
