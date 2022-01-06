package data.dead;

public class SnakeWhite {
    private final Object lockWhite = new Object();


    public void perform() {
        synchronized (lockWhite) {
            System.out.println("mr.White is here");
        }
    }
}
