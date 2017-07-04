package ro.teamnet.herotozero.oop.graphicshape.runapp;

import ro.teamnet.herotozero.oop.graphicshape.*;

/**
 * Created by Ginel.Guiu on 7/4/2017.
 */
public class RunApp {
    public static void main(String[] args)
    {
        Shape s = new Circle(10);
        System.out.println("New shape area"+s.area());
        ShapeBehaviour sb = new Square(10);
        System.out.println("New shape behaviour area"+sb.area());
        Circles c1 = new Circles();
        System.out.println("Aria este "+c1.getAreaPub());
        c1.getAreaDef();
        Object p1 = new Point(10, 20);
        Object p2 = new Point(50, 100);
        Object p3 = new Point(10, 20);
        System.out.println("p1 equals p2 is " + p1.equals(p2));
        System.out.println("p1 equals p3 is " + p1.equals(p3));
        Rhombus r = new Rhombus(6);
        r.prop1();
    }
}
