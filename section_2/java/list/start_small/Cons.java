// FOR MONDAY: show assignment
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

    // [1, 2, 3].sum(): 6
    // new Cons(1, new Cons(2, new Cons(3, new Nil()))).sum()
    public int sum() {
        // What's the recursive call?
        //   -What's smaller than me?
        // head: 1
        // tail: [2, 3]
        // this: [1, 2, 3]
        int rest = tail.sum();
        // rest: 5
        return rest + head;
        // return tail.sum() + head;
    }

    // [2, 3].addAmount(4)
    // ==> [6, 7]

    // while (x < 7) { ... }
    // tail recursion optimizations
    
    // [1, 2, 3].addAmount(4)
    // new Cons(1, new Cons(2, new Cons(3, new Nil())))
    // ==> [5, 6, 7]
    public ImmutableList addAmount(int amount) {
        // head: 1
        // tail: [2, 3]
        // amount: 4
        // this: [1, 2, 3]

        // tail : ImmutableList
        // ((Cons)tail).tail
        ImmutableList rest = tail.addAmount(amount);
        // rest: [6, 7]
        int newAmount = head + amount;
        // newAmount: 5
        return new Cons(newAmount, rest); // [5, 6, 7]
        // return new Cons(head + amount, tail.addAmount(amount));
    }
}
