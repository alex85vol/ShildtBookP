package Chapter7;

/**
 * Created by ovo on 22.01.2016.
 */
abstract class TwoDShapeAbstract {
    private double width;
    private double height;
    private String name;
    // Конструктор no умолчанию.
    TwoDShapeAbstract()	{
        width = height = 0.0;
        name = "null";
    }
    // Параметризированный конструктор.
    TwoDShapeAbstract(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }
    // построить объект с одинаковыми значениями
// переменных экземпляра width и height
    TwoDShapeAbstract(double x, String n) {
        width = height = x;
        name = n;
    }
    // построить один объект на основании другого объекта
    TwoDShapeAbstract(TwoDShapeAbstract ob) {
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
    // Теперь метод area () является абстрактным.
    abstract double area();

}
