public class DatabaseDestination implements Destination {
    public final DatabaseHandle databaseDestination;
    public DatabaseDestination(final DatabaseHandle databaseDestination) {
        this.databaseDestination = databaseDestination;
    }
    public void write(String thing) {
        databaseDestination.putIntoTable(thing);
    }
}

