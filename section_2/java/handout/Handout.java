public class Handout {
    public static void original() {
        boolean b = (randomBoolean()) ? true : false;
        if (b) {
            System.out.println("foo");
        } else {
            System.out.println("bar");
        }
    }

    // "primitive types" - boolean, int, long, float, double ...    
    public static boolean randomBoolean() { ... }
    
    public static void newVersion() {
        // Conditional c = (randomBoolean()) ?
        //     new Conditional("foo") :
        //     new Conditional("bar");
        Conditional c = (randomBoolean()) ?
            new PrintsFoo() : // ... must be an instance of Conditional
                              // operation() prints foo
            new PrintsBar();  // ... must be an instance of Conditional
                              // operation() prints bar

        // operation() must be defined on Conditional
        // operation() must not take any parameters
        // operation() probably returns void
        // operation() prints either "foo" or "bar"
        c.operation();
    }
}
