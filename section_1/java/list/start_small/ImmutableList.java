// [1]: new Cons(1, new Nil())
// ((Cons)((Cons)l0).tail).tail
// [1, 2]: // ImmutableList l0 = new Cons(1, new Cons(2, new Nil()));
//         ImmutableList l0 = new Nil();
//         ((Cons)((Cons)l0).tail).tail
// [1, 2, 3]: new Cons(1, new Cons(2, new Cons(3, new Nil())))
public interface ImmutableList {
    // ImmutableList example = new Cons(1, new Cons(2, new Nil()));
    // if (example.isEmpty()) { ... } // isEmpty called: Cons
    //
    // ImmutableList example2 = new Nil();
    // if (example2.isEmpty()) { ... } // isEmpty called: Nil
    public boolean isEmpty();

    // [3, 2, 1]: 6 (3 + 2 + 1)
    // []: 0
    public int sum();

    // [1, 2, 3].addAmount(2)
    // ==> [3, 4, 5]
    //
    // [7, 2, 4].addAmount(1)
    // ==> [8, 3, 5]
    //
    // [1, 1, 1, 1].addAmount(2)
    // ==> [3, 3, 3, 3]
    //
    // [].addAmount(1)
    // ==> []
    public ImmutableList addAmount(int amount);
}
