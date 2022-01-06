package data.volotile;

public class TaskCountVolotile implements Runnable {
    final Counting task;

    public TaskCountVolotile(Counting task) {
        this.task = task;
    }


    @Override
    public void run() {
        task.add();
        System.out.println(Thread.currentThread().getName() + " " + task.getCount());
    }
}
