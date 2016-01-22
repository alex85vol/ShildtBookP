package Chapter7;

/**
 * Created by ovo on 22.01.2016.
 */
 class TriangleA extends TwoDShapeAbstract {

    private String style;

    // Конструктор по умолчанию.
    TriangleA()	{
        super () ;
        style = "null";
    }
    // Конструктор класса Triangle.
    TriangleA(String s, double w, double h) {
        super(w, h, "triangle");
        style = s;
    }
    // Конструктор с одним аргументом для построения треугольника.
    TriangleA(double х) {
        super(х, "triangle"); // вызвать конструктор суперкласса
        style = "isosceles";
    }
    // построить один объект на основании другого объекта
    TriangleA(TriangleA ob) {
            super(ob); // передать объект конструктору класса TwoDShape
            style = ob.style;
        }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
