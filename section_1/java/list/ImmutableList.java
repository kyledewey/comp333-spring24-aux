public interface ImmutableList {
    public int sum(); // empty list sum is defined as 0
    public int length();

    // [1, 2, 3].contains(4): false
    // [1, 2, 3].contains(3): true
    public boolean contains(final int value);

    // [1, 2, 3].append([4, 5, 6]): [1, 2, 3, 4, 5, 6]
    // [4].append([2, 3]): [4, 2, 3]
    // [].append([4, 5, 6]): [4, 5, 6]
    public ImmutableList append(final ImmutableList other);

    public boolean equals(final Object other);
    public String toString();
    public int hashCode();
} // ImmutableList
