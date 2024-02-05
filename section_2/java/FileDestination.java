public class FileDestination extends Destination {
    private final FileWriter writer;
    public FileDestination(final FileWriter writer) {
        this.writer = writer;
    }
    public void write(String thingToWrite) {
        writer.println(thingToWrite);
    }
    public void close() {
        writer.close();
    }
}
