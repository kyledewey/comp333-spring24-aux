public abstract class Conditional {
    public final int myInt;
    public Conditional() {
        myInt = 7;
    }
    
    // need operation method
    // should take no parameters
    // operation probably returns void
    public abstract void operation();

    public void myMethod() { System.out.println("hi"); }
}
