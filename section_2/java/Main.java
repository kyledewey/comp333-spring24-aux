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
    
    public static void write(FileWriter writer,
                             NetworkSocket socket,
                             String thingToWrite) {
        if (writer != null) {
            writer.println(thingToWrite);
        } else if (socket != null) {
            socket.send(thingToWrite);
        } else {
            System.out.println(thingToWrite);
        }
    }

    public static int doComputation(FileWriter writer,
                                    NetworkSocket socket) {
        int retval = 0;
        for (int x = 1; x < 500; x++) {
            retval = x * 5 + retval;
            if (x % 100 == 0) {
                write(writer, socket, "Working");
            }
        }
        return retval;
    }
    
    public static void main(String[] args) {
        String filename = getFileName(args);
        IPAddress address = getNetworkLocation(args);
        FileWriter writer = null;
        NetworkSocket socket = null;
        if (filename != null) {
            writer = new BufferedWriter(new FileWriter(filename));
        } else if (address != null) {
            socket = new NetworkSocket(address);
        }
        int result = doComputation(writer, socket);
        write(writer, socket, result);
        if (filename != null) {
            writer.close();
        } else if (socket != null) {
            socket.close();
        }
    }
}
