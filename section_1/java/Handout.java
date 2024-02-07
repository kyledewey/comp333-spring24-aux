public class Handout {
    public void original() {
        boolean b = (randomBoolean()) ? true : false;
        if (b) {
            System.out.println("foo");
        } else {
            System.out.println("bar");
        }
    }

    public void newVersion() {
        // ...: Conditional
        Conditional c = (randomBoolean()) ? new Foo() : new Bar();
        // if c's runtime type is Foo, operation will print foo
        // if c's runtime type is Bar, operation will print bar
        c.operation(); // prints "foo" or "bar"
    }
}
