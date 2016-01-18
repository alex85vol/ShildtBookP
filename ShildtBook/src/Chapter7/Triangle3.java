package Chapter7;

/**
 * Created by ovo on 18.01.2016.
 */
public class Triangle3 extends TwoDShape2 {

    private String style;

    Triangle3(String s, double w, double h) {
// Использование оператора super () для вызова
// конструктора класса TwoDShape.
        super(w, h); // вызвать конструктор суперкласса
        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);

    }
}
