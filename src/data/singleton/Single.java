package data.singleton;

public class Single {
    private int value;
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
