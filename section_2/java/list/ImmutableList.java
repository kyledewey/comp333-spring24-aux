public interface ImmutableList {
    public int length();
    public int sum(); // empty list sum is defined as 0

    // [1, 2, 3].append([4, 5, 6])
    // ==> [1, 2, 3, 4, 5, 6]
    //
    // [3, 2].append([1])
    // ==> [3, 2, 1]
    //
    // [7, 2, 9, 4].append([0, 3, 2])
    // ==> [7, 2, 9, 4, 0, 3, 2]
    //
    // [].append([3, 4, 5])
    // ==> [3, 4, 5]
    public ImmutableList append(final ImmutableList other);


    // [1, 2, 3].contains(4): false
    // [1, 2, 3].contains(2): true
    // [].contains(5): false
    public boolean contains(final int value);


    public boolean equals(final Object other);
    public String toString();
    public int hashCode();
} // ImmutableList
