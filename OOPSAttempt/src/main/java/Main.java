import processing.core.*;
import java.util.*;

public class Main extends PApplet {
    static final int WINDOW_WIDTH =1080;
    static final int WINDOW_HEIGHT =720;
    static final int BALL_HEIGHT=15;
    static final int BALL_WIDTH=15;
    static final int INITIAL_X=0;
    static final int NUMBER_OF_BALLS=4;
    List<Ball> balls;
    public static void main(String[] args)
    {
        PApplet.main("Main", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WINDOW_WIDTH,WINDOW_HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        generateBalls();
    }

    @Override
    public void draw() {
        for(int i=0;i<NUMBER_OF_BALLS;i++)
        {
            moveBalls(balls.get(i));
        }
    }

    void generateBalls()
    {
        balls= new ArrayList<>();
        for(int i=1;i<=NUMBER_OF_BALLS;i++)
        {
            Ball temp= new Ball(INITIAL_X,(float)(i*(WINDOW_HEIGHT /5)),i,BALL_HEIGHT,BALL_WIDTH,this);
            balls.add(temp);
        }
    }

    void moveBalls(Ball ball)
    {
        ball.display();
        ball.roll();
    }
}
