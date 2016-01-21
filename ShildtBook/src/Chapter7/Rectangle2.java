package Chapter7;

/**
 * Created by ovo on 21.01.2016.
 */
public class Rectangle2 extends TwoDShape5 {
    Rectangle2()	{
        super();
    }
// Конструктор класса Rectangle.
    Rectangle2(double w, double h) {
        super(w, h, "rectangle"); // вызвать конструктор суперкласса
    }
    // построить квадрат
    Rectangle2(double x) {
        super( x, "rectangle"); // вызвать конструктор суперкласса
    }
    // построить один объект на основании другого объекта
    Rectangle2(Rectangle2 ob) {
        super(ob); // передать объект конструктору класса TwoDShape
    }
    boolean isSquare() {
        if (getWidth () == getHeight()) return true;
        return false;
    }
    // Переопределение метода area() для класса Rectangle.
    double area() {
        return getWidth() * getHeight();
    }
}
