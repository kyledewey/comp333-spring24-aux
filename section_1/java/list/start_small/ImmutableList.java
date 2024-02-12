// [1]: new Cons(1, new Nil())
// ((Cons)((Cons)l0).tail).tail
// [1, 2]: // ImmutableList l0 = new Cons(1, new Cons(2, new Nil()));
//         ImmutableList l0 = new Nil();
//         ((Cons)((Cons)l0).tail).tail
// [1, 2, 3]: new Cons(1, new Cons(2, new Cons(3, new Nil())))
public interface ImmutableList {
    public boolean isEmpty();
}
