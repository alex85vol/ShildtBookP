package Chapter7;

/**
 * Created by ovo on 18.01.2016.
 */
public class Triangle2 extends TwoDShape{


    private String style;
    // Конструктор.
    Triangle2(String s, double w, double h) {
// Инициализация родительской части объекта,
// соответствующей классу TwoDShape.
        setWidth(w);
        setHeight(h);
         style = s;
    }
    double area()	{
        return getWidth() * getHeight() / 2;
    }
    void showStyle()	{
        System.out.println("Triangle is " + style);
    }
}
