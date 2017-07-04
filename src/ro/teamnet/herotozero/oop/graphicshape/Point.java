package ro.teamnet.herotozero.oop.graphicshape;

/**
 * Created by Ginel.Guiu on 7/4/2017.
 */
public class Point {
    private int xPos;
    private int yPos;

    public Point()
    {

    }
    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null)
            return false;
        if (other instanceof Point) {
            Point anotherPoint = (Point) other;
            // two points are equal only if their x and y positions are equal
            if ((xPos == anotherPoint.xPos) && (yPos == anotherPoint.yPos))
                return true;

        }
        return false;
    }
}
