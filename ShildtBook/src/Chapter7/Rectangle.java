package Chapter7;

/**
 * Created by ovo on 18.01.2016.
 */
public class Rectangle extends TwoDShape {

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }
    double area() {
        return getWidth() * getHeight();

    }
}
