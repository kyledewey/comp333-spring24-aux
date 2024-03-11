public class LockedLock implements Lock {
    public Lock unlock() {
        System.out.println("lock unlocked");
        return new UnlockedLock();
    }
    public Lock lock() {
        System.out.println("lock already locked");
        return this;
    }
    public boolean isLocked() {
        return true;
    }
}
