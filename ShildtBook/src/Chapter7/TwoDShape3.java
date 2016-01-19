package Chapter7;

/**
 * Created by ovo on 19.01.2016.
 */
public class TwoDShape3 {
    private double width;
    private double height;
    // Конструктор по умолчанию.
    TwoDShape3()	{
        width = height = 0.0;
    }
    // Параметризированный конструктор.
    TwoDShape3(double w, double h) {
        width = w;
        height = h;
    }
    // Конструирование объекта с одинаковыми значениями
// переменных экземпляра width и height.
    TwoDShape3(double x) {
        width = height = x;
    }
    // Методы доступа к переменным экземпляра width и height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
        }
    }
