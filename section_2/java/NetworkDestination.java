public class NetworkDestination extends Destination {
    private final NetworkSocket socket;
    public NetworkDestination(final NetworkSocket socket) {
        this.socket = socket;
    }
    public void write(String thingToWrite) {
        socket.send(thingToWrite);
    }
    public void close() {
        socket.close();
    }
}
