package Chapter7;

/**
 * Created by ovo on 18.01.2016.
 */
public class TwoDShape2 {
    private double width;
    private double height;
    // Constructor of TwoDShape2 class with parameters
    TwoDShape2(double w, double h) {
        width = w;
        height = h;
    }
    // Access methods for variables width and height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
        }
    }
