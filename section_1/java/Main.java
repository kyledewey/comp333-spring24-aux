// Program does some calculation
// Prints out some result to the terminal
//
// Reads command-line arguments to determine
// where to print to.

public class Main {
    // returns a String - filename to write to
    // OR returns null - not writing to a file
    public static String fileToWriteTo(String[] args) {
        if (args.length == 1) {
            return args[0];
        } else {
            System.out.println("ERROR");
        }
    }

    // returns IPAddress - network location to write to
    // OR returns null - not writing to a network location
    public static IPAddress networkLocationToWriteTo(String[] args) {
        // ...
    }
    
    public static int doCalculation(Destination destination) {
        // Magic
        int retval = 0;
        for (int x = 0; x < 10000; x++) {
            if (x % 1000 == 0) {
                destination.write("Still running");
            }
            retval = (retval + 1) * 2;
        }
        
        return retval;
    }

       
    public static void main(String[] args) {
        // fileToWriteTo returns null if we should write to the terminal
        // otherwise it returns the name of the file to write to
        // String filename = fileToWriteTo(args);
        // IpAddress networkLocation = networkLocationToWriteTo(args);
        // Writer destination = null;
        // if (filename != null) {
        //     destination = new BufferedWriter(new FileWriter(filename));
        // }
        //
        // SOMEHOW: a destination is made
        Destination destination = new Destination(...);
        int result = doCalculation(destination);
        destination.write(Integer.toString(result));
        destination.close();
    }
}
