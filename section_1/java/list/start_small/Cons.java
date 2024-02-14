// For Monday: show the assignment code itself and run through it
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

    // recursive case
    // What would recursive call look like?
    //   1.) What's smaller than what I started with?
    public int sum() {
        int rest = tail.sum();
        return head + rest;
        // return head + tail.sum();
    }

    // [1, 2, 3].addAmount(2)
    // new Cons(1, new Cons(2, new Cons(3, new Nil())))
    // ==> [3, 4, 5]
    public ImmutableList addAmount(int amount) {
        // return new Cons(head + amount, tail.addAmount(amount));
        // head: 1
        // tail: [2, 3]
        // amount: 2
        // this: [1, 2, 3]
        ImmutableList rest = tail.addAmount(amount);
        // rest: [2, 3].addAmount(2)
        // ==> [4, 5]
        return new Cons(head + amount, rest); // [3, 4, 5]
    }
}
