// struct Destination {
//   Writer fileDestination;
//   NetworkSocket networkDestination;
//   DatabaseHandle databaseDestination;
// };
//
// void write(struct Destination* dest, char* thingToWrite);
//
//
// write(destination, "foo");
//
// destination.write("foo");

//
// int add(int x, int y); // prototype
//
// int add2(int x, int y) { return add(x, y); }
// int add(int x, int y) { return x + y; }

// public abstract class Destination { ... }
public interface Destination {
    public void write(String thing);
    public void close();
}
