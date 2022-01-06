package data.singleton;

public class TaskSingle implements Runnable {

    @Override
    public void run() {
        Single single = Single.getInstance(0);
        single.add();
        System.out.println(single.getValue());
    }
}
