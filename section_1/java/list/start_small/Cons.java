public class Cons implements ImmutableList {
    public final int head;
    public final ImmutableList tail;
    public Cons(final int head,
                final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    }

    public boolean isEmpty() {
        return false;
    }
}
