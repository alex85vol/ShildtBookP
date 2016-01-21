package Chapter7;

/**
 * Created by ovo on 21.01.2016.
 */
public class Triangle5 extends TwoDShape4 {

    private String style;

    // Конструктор по умолчанию.
    Triangle5() {
        super();
        style = "null";
    }

    // Конструктор класса Triangle.
    Triangle5(String s, double w, double h) {
        super(w, h); // вызвать конструктор суперкласса
        style = s;
    }

    // Конструктор с одним аргументом для построения треугольника.
    Triangle5(double х) {
        super(х); // вызвать конструктор суперкласса
        style = "isosceles";
    }

    // построить один объект на основании другого объекта
    Triangle5(Triangle5 ob) {
// Передача ссылки на объект Triangle конструктору класса TwoDShape.
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);

    }
}
