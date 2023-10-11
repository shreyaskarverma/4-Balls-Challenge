import processing.core.*;
public class Ball extends PApplet {
    private float x;
    private float y;
    private int speed;
    private int length;
    private int width;
    Main var;
    Ball(float x,float y,int speed,int length,int width,Main var)
    {
        this.x=x;
        this.y=y;
        this.speed=speed;
        this.length=length;
        this.width=width;
        this.var=var;
    }
    void roll()
    {
        x+=speed;
    }
    void display()
    {
        var.ellipse(x,y,length,width);
    }
}
