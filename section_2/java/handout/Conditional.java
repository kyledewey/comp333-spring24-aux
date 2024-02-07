// Conditional c = new Conditional(); // won't compile
// c.operation();
public interface Conditional {
    public void operation();
}

// public class Conditional {
//     public final String value;
//     public Conditional(final String value) {
//         this.value = value;
//     }
//     public void operation() {
//         System.out.println(value);
//     }
// }
