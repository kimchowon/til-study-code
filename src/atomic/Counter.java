package atomic;

public interface Counter {
    int balance = 0;

    void increment();

    int getBalance();
}
