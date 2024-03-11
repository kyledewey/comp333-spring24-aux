public class Example {
    public static boolean randomBoolean() { ... }
    
    public static Lock makeRandomLock() {
        if (randomBoolean()) {
            // subtyping polymorphism
            return new UnlockedLock();
        } else {
            // subtyping polymorphism
            return new LockedLock();
        }
    }

    public static void main(String[] args) {
        final Lock lock = makeRandomLock();
        // lock.unlock(): virtual dispatch / ad-hoc polymorphism
        final Lock newLock = lock.unlock();
    }
}
