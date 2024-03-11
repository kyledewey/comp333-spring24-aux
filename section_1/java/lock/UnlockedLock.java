public class UnlockedLock implements Lock {
    public Lock unlock() {
        System.out.println("lock already unlocked");
        return this;
    }    
    public Lock lock() {
        System.out.println("lock locked");
        return new LockedLock();
    }        
    public boolean isLocked() {
        return false;
    }
}
