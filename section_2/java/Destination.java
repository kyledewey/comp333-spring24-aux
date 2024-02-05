// struct Destination {
//   FileWriter writer;
//   NetworkSocket socket;
// };
//
// void write(struct Destination* destination, char* thingToWrite) { ... }
//
// write(destination, "foo");
//
// destination.write("foo");
public abstract class Destination {
    public abstract void write(String thingToWrite);
    public abstract void close();
}
