package Chapter7;

/**
 * Created by ovo on 19.01.2016.
 */
public class Triangle4 extends TwoDShape3 {

    private String style;
    // Использование оператора super () для вызова
// разных вариантов конструктора TwoDShape() .
// Конструктор по умолчанию.
    Triangle4() {
        super(); // вызвать конструктор суперкласса по умолчанию
        style = "null";
    }
    // Параметризированный конструктор.
    Triangle4(String s, double w, double h) {
        super(w, h); // вызвать конструктор суперкласса с двумя аргументами
        style = s;
    }
    // Конструктор с одним аргументом.
    Triangle4(double х) {
        super(х); // вызвать конструктор суперкласса с одним аргументом
        style = "isosceles";
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
