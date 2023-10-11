import processing.core.*;
import java.util.*;

public class Main extends PApplet {
    static final int WIDTH =1080;
    static final int HEIGHT =720;
    List<Ball> balls;
    public static void main(String[] args)
    {
        PApplet.main("Main", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        generateBalls(4);
    }

    @Override
    public void draw() {
        for(int i=0;i<4;i++)
        {
            moveBalls(balls.get(i));
        }
    }

    void generateBalls(int numberOfBalls)
    {
        balls= new ArrayList<>(4);
        for(int i=1;i<=numberOfBalls;i++)
        {
            Ball temp= new Ball(0,(float)(i*(HEIGHT /5)),i,15,15,this);
            balls.add(temp);
        }
    }

    void moveBalls(Ball ball)
    {
        ball.display();
        ball.roll();
    }
}
