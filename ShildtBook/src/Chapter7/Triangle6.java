package Chapter7;

/**
 * Created by ovo on 21.01.2016.
 */
public class Triangle6 extends TwoDShape5 {

    private String style;
    // Конструктор по умолчанию.
    Triangle6() {
        super () ;
        style = "null";
    }
    // Конструктор класса Triangle.
    Triangle6(String s, double w, double h) {
        super(w, h, "triangle");
        style = s;
    }
    // Конструктор с одним аргументом для построения треугольника
    Triangle6(double х) {
        super(х, "triangle"); // вызвать конструктор суперкласса
        style = "isosceles";
    }
    // построить один объект на основании другого объекта
    Triangle6(Triangle6 ob) {
        super(ob); // передать объект конструктору класса TwoDShape
        style = ob.style;
    }
    // Переопределение метода area() для класса Triangle.
    double area()	{
        return getWidth() * getHeight() / 2;
    }
    void showStyle()	{
        System.out.println("Triangle is " + style);

    }
}
