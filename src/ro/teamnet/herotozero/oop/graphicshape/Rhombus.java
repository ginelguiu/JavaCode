package ro.teamnet.herotozero.oop.graphicshape;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Ginel.Guiu on 7/4/2017.
 */
public final class Rhombus extends Exception {
    private final int side;

    public Rhombus(int side) {
        this.side = side;
        if (side < 0)
            throw new IllegalArgumentException("Vezi ca-i negativ, capitane");
    }

    public int res() {
        return this.side / 0;
    }

    public int prop2() {
        return res();
    }

    public void prop1() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("fisier.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Something's wrong, captain");
        }
    }
}
