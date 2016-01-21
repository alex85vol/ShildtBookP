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

    public static void Shapes3(){
        Triangle3 tl = new Triangle3("isosceles", 4.0, 4.0);
        Triangle3 t2 = new Triangle3("right", 8.0, 12.0);
        System.out.println("Info for tl: ") ;
        tl.showStyle();
        tl.showDim();
        System.out.println ("Area is " + tl.area());
        System.out.println() ;
        System.out.println("Info for t2: ") ;
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

    }

    public static void Shapes4(){
        Triangle4 tl = new Triangle4();
        Triangle4 t2 = new Triangle4("right", 8.0, 12.0);
        Triangle4 t3 = new Triangle4(4.0);
        tl = t2;
        System.out.println("Info for tl: ");
        tl.showStyle();
        tl.showDim();
        System.out .println ("Area is " + tl.area());
        System.out.println() ;
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
        System.out.println() ;
        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is " + t3.area());
        System.out.println();

    }

    public static void TruckDemo(){

        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;
        gallons = semi.fuelneeded(dist);
        System.out.println("Semi can carry " + semi.getCargo() +
                " pounds.");
        System.out.println("To go " + dist + " miles semi needs " +
                gallons + " gallons of fuel.\n");
        gallons = pickup.fuelneeded(dist);
        System.out.println("Pickup can carry " + pickup.getCargo() +
                " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " +
                gallons + " gallons of fuel.");

    }

    public static void Shapes5(){
        ColorTriangle tl =
                new ColorTriangle("Blue", "right", 8.0, 12.0);
        ColorTriangle t2 =
                new ColorTriangle("Red", "isosceles", 2.0, 2.0);
        System.out.println("Info for tl: ");
        tl.showStyle();
        tl.showDim();
        tl.showColor();
        System.out.println ("Area is " + tl.area());
        System.out.println ();
        System.out.println("Info for t2: ");
// Из объекта типа ColorTriangle можно вызывать как его
// собственные методы, так и методы его суперклассов.
        t2.showStyle ();
        t2.showDim();
        t2.showColor ();
        System.out.println("Area is " + t2.area());

    }

    public static void Shapes6(){
        Triangle5 tl = new Triangle5("right", 8.0, 12.0);
// создать копию объекта tl
        Triangle5 t2 = new Triangle5(tl);
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

    public static void Shapes7() {
        TwoDShape5 shapes[] = new TwoDShape5[5];
        shapes[0] = new Triangle6("right", 8.0, 12.0);
        shapes[1] = new Rectangle2(10);
        shapes[2] = new Rectangle2(10, 4);
        shapes[3] = new Triangle6(7.0);
        shapes[4] = new TwoDShape5(10, 20, "generic");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getName());
// Требуемый вариант метода area() вызывается
// для каждой геометрической фигуры в отдельности.
            System.out.println("Area is " + shapes[i].area());
            System.out.println();

        }


    }

}
