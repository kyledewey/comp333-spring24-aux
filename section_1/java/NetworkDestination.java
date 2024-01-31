public class NetworkDestination extends Destination {
    public final NetworkSocket networkDestination;
    public NetworkDestination(final NetworkSocket networkDestination) {
        this.networkDestination = networkDestination;
    }
    public void write(String thing) {
        networkDestination.send(thing);
    }
}
        
