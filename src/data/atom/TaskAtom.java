package data.atom;

public class TaskAtom implements Runnable{
    private AtomCount field;

    public TaskAtom(AtomCount field) {
        this.field = field;
    }

    @Override
    public void run() {
        field.add();
    }
}
