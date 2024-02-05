public class TerminalDestination extends Destination {
    public TerminalDestination() {}
    public void write(String thingToWrite) {
        System.out.println(thingToWrite);
    }
    public void close() {}
}
