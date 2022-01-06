package data.latch;

import java.util.concurrent.CountDownLatch;

public class TaskCount implements Runnable {
    private final CountDownLatch signal;
    final Task task;

    public TaskCount(CountDownLatch signal, Task latch) {
        this.signal = signal;
        this.task = latch;
    }

    @Override
    public void run() {
        try {
            signal.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task.add();
        System.out.println(Thread.currentThread().getName() + " " + task.getCounter());
    }
}
