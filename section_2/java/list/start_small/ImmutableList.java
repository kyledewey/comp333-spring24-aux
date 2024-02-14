public interface ImmutableList {
    public boolean isEmpty();

    // [1, 2, 3].sum(): 6
    // [4, 5].sum(): 9
    // [].sum(): 0
    public int sum();

    // [1, 2, 3].addAmount(4)
    // ==> [5, 6, 7]
    //
    // [1, 1, 1].addAmount(2)
    // ==> [3, 3, 3]
    //
    // [].addAmount(5)
    // ==> []
    public ImmutableList addAmount(int amount);
}
