package Chapter7;

/**
 * Created by ovo on 18.01.2016.
 */
public class DemoMeth {

    public static void ShapesTriangle(){
        Triangle tl = new Triangle();
        Triangle t2 = new Triangle();
// Все члены класса Triangle, даже унаследованные от класса
// TwoDShape, доступны из объектов типа Triangle.
        tl.setWidth(4.0);
        tl.setHeight(4.0);
        tl.style = "isosceles";
        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "right";
        System.out.println("Info for tl: ");
        tl.showStyle();
        tl.showDim();
        System.out.println ("Area is " + tl.area());
        System.out.println();
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

    }

    public static void ShapesRectangle(){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        String s1 = "foursquare";
        String s2 = "rectangle";
        r1.setWidth(5.0);
        r1.setHeight(5.0);
        System.out.println("\nInfo for rl: ");
        if(r1.isSquare() == true) System.out.println("It is " + s1);
        else System.out.println("It is " + s2);

        if(r1.isSquare() == true) System.out.println("The square of " + s1 + " is " + r1.area());
        else System.out.println("The square of " + s2 + " is " + r1.area());


        r2.setWidth(8.0);
        r2.setHeight(5.0);
        System.out.println("\nInfo for r2: ");
        if(r2.isSquare() == true) System.out.println("It is " + s1);
        else System.out.println("It is " + s2);

        if(r2.isSquare() == true) System.out.println("The square of " + s1 + " is " + r2.area());
        else System.out.println("The square of " + s2 + " is " + r2.area());

    }

    public static void Shapes2(){
        Triangle2 tl = new Triangle2("isosceles", 4.0, 4.0);
        Triangle2 t2 = new Triangle2("right", 8.0, 12.0);
        System.out.println("Info for tl: ");
        tl.showStyle();
        tl.showDim();
        System.out.println ("Area is " + tl.area());
        System.out.println() ;
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }

}
