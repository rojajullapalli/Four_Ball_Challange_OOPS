import processing.core.PApplet;

public class Ball {
    private final int y;
    private final int speed;
    private int x;

    public Ball(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void move() {
        x += speed;
    }

    public void draw(PApplet pApplet) {
        pApplet.ellipse(x, y, 10, 10);
    }
}
