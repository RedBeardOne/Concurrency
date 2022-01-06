package data.dead;

public class SnakeLaunch extends Thread {
    private SnakeWhite snakeOne;
    private SnakeWhite snakeTwo;

    public SnakeLaunch(SnakeWhite snakeWhite, SnakeWhite snakeBlack) {
        this.snakeOne = snakeWhite;
        this.snakeTwo = snakeBlack;
    }




    @Override
    public void run() {
        synchronized (snakeOne) {
            snakeOne.perform();
            synchronized (snakeTwo) {
                snakeTwo.perform();
            }
        }
        System.out.println("At the end, never reached");
    }
}
