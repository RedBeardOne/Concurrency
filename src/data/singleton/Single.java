package data.singleton;

public class Single {
    private volatile int value;  //marked as volatile solved the problem
    private static Single instance;

    public Single(int value) {
        this.value = value;
    }

    public static Single getInstance(int value) {
        if (instance == null) {
            instance = new Single(value);
            System.out.println("Here we are");
        }
        return instance;
    }

    public void add(){
        value++;
    }

    public int getValue() {
        return value;
    }
}
