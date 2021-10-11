package atomic;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class Test01 {

    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank();
        int threadCount = 2;

        CountDownLatch latch = new CountDownLatch(threadCount);
        for (int i = 0; i < threadCount; i++) {

            new Thread(() -> {
                for (int j = 1; j <= 100; j++) {
                    System.out.println(Thread.currentThread().getName() + " " + bank.increment() +"원");

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
        System.out.println("total = " + bank.getBalance());
    }
}
