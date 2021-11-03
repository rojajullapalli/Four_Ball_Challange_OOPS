import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class FourBallChallenge extends PApplet {
    private static final int WIDTH = 640;
    private static final int HEIGHT = 640;
    private static final int SPEED_1 = 1;
    private static final int SPEED_2 = 2;
    private static final int SPEED_3 = 3;
    private static final int SPEED_4 = 4;

    List<Ball> balls;

    public static void main(String[] args) {
        PApplet.main("FourBallChallenge", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        Ball ball1 = new Ball(0, (int) (HEIGHT * 0.5f / 4), SPEED_1);
        Ball ball2 = new Ball(0, (int) (HEIGHT * 1.5 / 4), SPEED_2);
        Ball ball3 = new Ball(0, (int) (HEIGHT * 2.7 / 4), SPEED_3);
        Ball ball4 = new Ball(0, (int) (HEIGHT * 3.7 / 4), SPEED_4);

        balls = Arrays.asList(ball1, ball2, ball3, ball4);
    }

    @Override
    public void draw() {
        balls.forEach(Ball::move);
        balls.forEach(Ball -> Ball.draw(this));
    }
}
