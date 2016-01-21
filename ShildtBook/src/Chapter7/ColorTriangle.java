package Chapter7;

/**
 * Created by ovo on 21.01.2016.
 */
public class ColorTriangle extends Triangle4 {

    private String color;

    ColorTriangle(String c, String s,
                  double w, double h) {
        super(s, w, h);
        color = c;
    }
    String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Color is " + color);

    }
}
