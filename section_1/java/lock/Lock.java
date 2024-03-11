public interface Lock {
    public Lock unlock();
    public Lock lock();
    public boolean isLocked();
}
    
    
// public class Lock {
//     private final boolean locked;

//     public Lock(final boolean locked) {
//         this.locked = locked;
//     }

//     public Lock unlock() {
//         if (locked) {
//             System.out.println("lock unlocked");
//             return new Lock(false);
//         } else {
//             System.out.println("lock already unlocked");
//             return this;
//         }
//     }

//     public Lock lock() {
//         if (!locked) {
//             System.out.println("lock locked");
//             return new Lock(true);
//         } else {
//             System.out.println("lock already locked");
//             return this;
//         }
//     }

//     public boolean isLocked() {
//         return locked;
//     }
// }
