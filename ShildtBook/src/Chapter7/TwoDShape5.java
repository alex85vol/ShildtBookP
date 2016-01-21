package Chapter7;

/**
 * Created by ovo on 21.01.2016.
 */
public class TwoDShape5 {
    private double width;
    private double height;
    private String name;
    // Конструктор по умолчанию.
    TwoDShape5()	{
        width = height = 0.0;
        name = "null";
    }
    // Параметризированный конструктор.
    TwoDShape5(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }
    // построить объект с одинаковыми значениями
// переменных экземпляра width и height
    TwoDShape5(double x, String n) {
        width = height = x;
        name = n;
    }
    // построить один объект на основании другого объекта
    TwoDShape5(TwoDShape5 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    // Методы доступа к переменным width и height,
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    String getName() { return name; }
    void showDim()	{
        System.out.println("Width and height are " +
                width + " and " + height);
    }
    // Метод area() определен в классе TwoDShape.
    double area() {
        System.out.println("area() must be overridden");
        return 0.0;
    }
}

