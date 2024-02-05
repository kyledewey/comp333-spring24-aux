// Does some computation
// Prints out result to terminal, file, or network location,
// depending on command-line arguments
//
// FOR NEXT TIME: introduce an object
public class Main {
    // returns the name of the file to write to,
    // or null if we don't write to a file
    public static String getFileName(String[] args) { ... }

    // returns the IPAddress to write to, or null
    // if we don't write to an IPAddress
    public static IPAddress getNetworkLocation(String[] args) { ... }
    
    public static int doComputation(Destination destination) {
        int retval = 0;
        for (int x = 1; x < 500; x++) {
            retval = x * 5 + retval;
            if (x % 100 == 0) {
                destination.write("Working");
            }
        }
        return retval;
    }

    // FOR MONDAY: subtyping
    public static void main(String[] args) {
        String filename = getFileName(args);
        IPAddress address = getNetworkLocation(args);
        Destination destination = null;
        if (filename != null) {
            // subtyping polymorphism
            destination = new FileDestination(new FileWriter(filename));
        } else if (address != null) {
            destination = new NetworkDestination(new NetworkSocket(address));
        } else {
            destination = new TerminalDestination();
        }
        int result = doComputation(destination);
        // ad-hoc polymorphism: the actual write method called is determined
        // at runtime: O(1)
        destination.write(result);
        destination.close();
    }
}
