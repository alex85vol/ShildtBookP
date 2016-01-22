package Chapter7;

/**
 * Created by ovo on 22.01.2016.
 */
class RectangleA extends TwoDShapeAbstract {
    RectangleA(){super();}

    RectangleA(double w, double h){
        super (w, h, "rectangle");
    }

    RectangleA(double х) {
        super(х, "rectangle"); // вызвать конструктор суперкласса
    }
    // построить один объект на основании другого объекта
    RectangleA(RectangleA ob) {
        super(ob); // передать объект конструктору класса TwoDShape
    }
    boolean isSquare() {
        if (getWidth () == getHeight()) return true;
        return false;
    }
    double area() {
        return getWidth() * getHeight();
    }
}