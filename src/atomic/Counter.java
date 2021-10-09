package atomic;

public class Counter {
    private int count;

    public int increment() {
        return count += 1000;
    }

    public int getCount() {
        return count;
    }
}
