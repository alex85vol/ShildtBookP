package Chapter7;

/**
 * Created by ovo on 21.01.2016.
 */
public class TwoDShape4 {

    private double width;
    private double height;

    // Конструктор по умолчанию.
    TwoDShape4() {
        width = height = 0.0;
    }

    // Параметризированный конструктор.
    TwoDShape4(double w, double h) {
        width = w;
        height = h;
    }

    // построить объект с одинаковыми значениями
// переменных экземпляра width и height
    TwoDShape4(double x) {
        width = height = x;
    }

    // Построение одного объекта на основании другого объекта.
    TwoDShape4(TwoDShape4 ob) {
        width = ob.width;
        height = ob.height;
    }


    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }

    double area() {
        System.out.println("area() must be overridden");
        return 0.0;
    }
}

