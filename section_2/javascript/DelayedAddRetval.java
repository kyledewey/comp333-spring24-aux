public class DelayedAddRetval {
    public final int x;
    public DelayedAddRetval(final int x) {
        this.x = x;
    }
    
    public int add(final int y) {
        return x + y;
    }
}
