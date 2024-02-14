public class Nil implements ImmutableList {
    public Nil() {}
    public boolean isEmpty() {
        return true;
    }
    public int sum() {
        return 0;
    }

    // [].addAmount(1)
    // ==> []
    public ImmutableList addAmount(int amount) {
        // this: []
        return this;
        // return new Nil();
    }
}
