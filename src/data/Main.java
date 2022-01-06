package data;

import data.dead.SnakeLaunch;
import data.dead.SnakeWhite;
import data.singleton.Single;
import data.singleton.TaskSingle;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        SnakeWhite snakeWhite = new SnakeWhite();
        SnakeWhite snakeBlack = new SnakeWhite();

        SnakeLaunch launcherWhite =  new SnakeLaunch(snakeBlack, snakeWhite);
        SnakeLaunch launcherBlack =  new SnakeLaunch(snakeWhite, snakeBlack);
        launcherWhite.start();
        launcherBlack.start();


//        CountDownLatch locker = new CountDownLatch(2000);
//        ExecutorService executorService = Executors.newFixedThreadPool(2000);
//        for (int i = 0; i < 2000; i++) {
//            executorService.execute(new TaskSingle(locker));
//        }
//        try {
//            locker.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        AtomCount atomCount = new AtomCount();
//        TaskAtom task = new TaskAtom(atomCount);
//        for (int i = 0; i < 2000; i++) {
//          executorService.execute(task);
//        }

//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        Counting count = new Counting();
//        TaskCountVolotile taskCountVolotile = new TaskCountVolotile(count);
//        for (int i = 0; i < 2000; i++) {
//            executorService.execute(taskCountVolotile);
//        }
//        System.out.println(count.getCount() + " counted");

//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        Task task = new Task();
//        int threadCount = 2000;
//        CountDownLatch latch = new CountDownLatch(threadCount);
//        for (int i = 0; i < threadCount; i++) {
//            executorService.execute(new TaskCount(latch, task));
//        }
//        for (int i = 0; i < threadCount; i++) {
//            latch.countDown();
//        }
//        System.out.println(task.getCounter());
    }
}
