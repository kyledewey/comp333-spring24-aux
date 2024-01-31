public class TerminalDestination implements Destination {
    public TerminalDestination() {}
    
    public void write(String thing) {
        System.out.println(thing);
    }

    public void close() {}
}
