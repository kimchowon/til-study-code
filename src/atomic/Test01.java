package atomic;

import sun.jvm.hotspot.runtime.Threads;

import java.util.concurrent.CountDownLatch;

public class Test01 {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        int threadCount = 2;

        CountDownLatch latch = new CountDownLatch(threadCount);
        for (int i = 0; i < threadCount; i++) {
            new Thread(() -> {
                for (int j = 1; j <= 100; j++) {
                    System.out.println(Thread.currentThread().getName() + " " + counter.increment() +"원");

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
        System.out.println("total = " + counter.getCount());
    }
}
