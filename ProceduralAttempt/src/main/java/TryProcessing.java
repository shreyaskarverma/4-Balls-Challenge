import processing.core.*;

public class TryProcessing extends PApplet {
    static final int WIDTH =1080;
    static final int HEIGHT =720;
    float y1= (float)(HEIGHT /5);
    float y2= (float)(2*(HEIGHT /5));
    float y3= (float)(3*(HEIGHT /5));
    float y4= (float)(4*(HEIGHT /5));
    float x1,x2,x3,x4;
    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        ellipse(x1,y1,15,15);
        ellipse(x2,y2,15,15);
        ellipse(x3,y3,15,15);
        ellipse(x4,y4,15,15);
        x1+=1;
        x2+=2;
        x3+=3;
        x4+=4;
    }
}
