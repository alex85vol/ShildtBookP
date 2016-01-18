package Chapter7;

/**
 * Created by ovo on 18.01.2016.
 */
public class Triangle extends TwoDShape {
    String style;
    double area() {
//Из класса Triangle можно обращаться к членам класса
// TwoDShape таким же обраэом, как и к собственным членам.
        return getWidth() * getHeight() / 2;
        }
    void showStyle() {
        System.out.println("Triangle is " + style);
        }

    }
