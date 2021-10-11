package atomic;

public class Bank {
    private int balance;

    public synchronized int increment() {
        return  balance += 1000;
    }

    public int getBalance() {
        return balance;
    }
}
