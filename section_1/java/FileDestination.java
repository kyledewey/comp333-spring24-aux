public class FileDestination implements Destination {
    public final Writer fileDestination;
    public FileDestination(final Writer fileDestination) {
        this.fileDestination = fileDestination;
    }
    public void write(String thing) {
        fileDestination.println(thing);
    }
    public void close() {
        fileDestination.close();
    }
}
