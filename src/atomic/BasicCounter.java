package atomic;

public class BasicCounter implements Counter {
    private int balance;

    public void increment() {
        balance += 1000;
        System.out.println(Thread.currentThread().getName() + " = " + balance);
    }

    public int getBalance() {
        return balance;
    }
}
