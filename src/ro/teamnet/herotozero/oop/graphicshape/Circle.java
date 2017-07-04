package ro.teamnet.herotozero.oop.graphicshape;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Created by Ginel.Guiu on 7/4/2017.
 */
public class Circle extends Shape{
    private int xPos;
    private int yPos;
    private int radius;

    public Circle()
    {
        this.xPos = 32;
        this.yPos = 24;
        this.radius = 29;
    }

    public Circle(int xPos, int yPos, int radius)
    {
        this.xPos = xPos;
        this.yPos = yPos;
        if(radius<0)
            throw new IllegalArgumentException("Negative radius");
        this.radius = radius;
    }

    public Circle(int radius)
    {
        this.radius = radius;
    }

    public Circle(int xPos, int yPos)
    {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public double area()
    {
        return PI*pow(this.radius,2);
    }

    public void fillColour(){
        System.out.println("Super colour:"+super.color);
    }
    public void fillColour(int val)
    {
        super.color=val;
        System.out.println("Super colour changed to:"+super.color);
    }

    @Override
    public String toString() {
        return "center= ("+this.xPos+","+this.yPos+") and radius="+this.radius;
    }
}
