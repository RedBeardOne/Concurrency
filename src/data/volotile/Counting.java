package data.volotile;

public class Counting {
    volatile int count;

    public Counting() {
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public void add() {
        count++;
    }
}
