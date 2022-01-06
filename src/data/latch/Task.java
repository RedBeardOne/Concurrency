package data.latch;

import java.util.concurrent.CountDownLatch;

public class Task {
    private int counter;

    public Task() {
        this.counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public void add() {
        counter++;
    }

}
