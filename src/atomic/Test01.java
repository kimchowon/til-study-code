package atomic;

import java.util.concurrent.CountDownLatch;

public class Test01 {

    public static void main(String[] args) throws InterruptedException {
      //  executeBasicCounter(new BasicCounter());

      //  executeBasicCounter(new SynchronizedCounter());

        executeBasicCounter(new SafeCounterWithoutLock());
    }

    public static void executeBasicCounter(Counter counter) throws InterruptedException {
        int threadCount = 2;

        CountDownLatch latch = new CountDownLatch(threadCount);
        for (int i = 0; i < threadCount; i++) {

            new Thread(() -> {
                for (int j = 1; j <= 100; j++) {
                    counter.increment();

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                latch.countDown();

            }).start();
        }

        latch.await();
        System.out.println("total = " + counter.getBalance());
    }
}
