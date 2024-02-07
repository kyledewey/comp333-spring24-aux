// Base b = new Base();
// b.implementMe(); // what's called?
public abstract class Base {
    public abstract void implementMe();
}

public abstract class Subclass1 extends Base {}

public class Subclass2 extends Subclass1 {
    public void implementMe() {}
}
