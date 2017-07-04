package ro.teamnet.herotozero.oop.graphicshape;

/**
 * Created by Ginel.Guiu on 7/4/2017.
 */
public class Shape extends AbstractShape implements ShapeBehaviour{
    protected int color;
    protected float saturation;
    public double area()
    {
        return 25;
    }

    public void setColor(int value)
    {
        this.color=value;
    }
    public void setSaturation(float value)
    {
        this.saturation = value;
    }
}
