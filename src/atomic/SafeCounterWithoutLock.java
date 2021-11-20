package atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeCounterWithoutLock  implements Counter {
    private final AtomicInteger counter = new AtomicInteger(0);

    public int getBalance() {
        return counter.get();
    }

    public void increment() {
        while (true) {
            int existingValue = getBalance();
            int newValue = existingValue + 1000;
            if (counter.compareAndSet(existingValue, newValue)) {
                return;
            } else {
            }
        }
    }
}
