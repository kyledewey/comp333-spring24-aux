public class Destination {
    public final Writer fileDestination;
    public final NetworkSocket networkDestination;
    public final DatabaseHandle databaseDestination;

    public Destination(final Writer fileDestination,
                       final NetworkSocket networkDestination,
                       final DatabaseHandle databaseDestination) {
        this.fileDestination = fileDestination;
        this.networkDestination = networkDestination;
        this.databaseDestination = databaseDestination;
    }

    public void write(String thing) {
        if (fileDestination != null) {
            fileDestination.println(thing);
        } else if (networkDestination != null) {
            networkDestination.send(thing);
        } else if (databaseDestination != null) {
            databaseDestination.putIntoTable(thing);
        } else {
            System.out.println(thing);
        }
    }

    public static void close() {
        // TODO: look at what we actually are, then close the right thing
    }
}
