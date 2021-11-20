package atomic;

public class SynchronizedCounter implements Counter{
    private int balance;

    public synchronized void increment() {
        balance += 1000;
        System.out.println(Thread.currentThread().getName() + " = " + balance);

    }

    public int getBalance() {
        return balance;
    }
}
