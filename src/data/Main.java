package data;

import data.atom.AtomCount;
import data.atom.TaskAtom;
import data.singleton.Single;
import data.singleton.TaskSingle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        TaskSingle single = new TaskSingle();
        for (int i = 0; i < 2000; i++) {
            executorService.execute(single);
        }

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
//
//        System.out.println(count.getCount() + " counted");

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
