package data.singleton;

import java.util.concurrent.CountDownLatch;

public class TaskSingle implements Runnable {
    private final CountDownLatch signal;

    public TaskSingle(CountDownLatch signal) {
        this.signal = signal;
    }

    @Override
    public void run() {
        Single single = Single.getInstance(0);
        single.add();
        System.out.println(single.getValue());
        signal.countDown();

    }
}
