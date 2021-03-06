package Chapter6;

/**
 * Created by ovo on 15.01.2016.
 */
public class PassOb {

    public static void passOb() {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);
// Здесь методам передаются объекты.
        System.out.println("ob1 same dimensions as ob2: " +
                ob1.sameBlock(ob2));
        System.out.println("ob1 same dimensions as ob3: " +
                ob1.sameBlock(ob3));
        System.out.println("ob1 same volume as ob3: " +
                ob1.sameVolume(ob3));
    }

    public static void callByValue() {
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a and b before call: " +
                a + " " + b);
        ob.noChange(a, b);
        System.out.println("a and b after call: " +
                a + " " + b);

    }

    public static void callByRef() {
        Test ob = new Test(15, 20);
        System.out.println("ob.a and ob.b before call: " +
                ob.a + " " + ob.b);
        ob.change(ob);
        System.out.println("ob.a and ob.b after call: " +
                ob.a + " " + ob.b);

    }

    public static void errorMsg() {
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));

    }

    public static void errInfo() {
        ErrorInfo err = new ErrorInfo();
        Err e;
        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severity: " + e.severity);
        e = err.getErrorInfo(19);
        System.out.println(e.msg + " severity: " + e.severity);

    }

    public static void overLoadDemo() {
        Overload ob = new Overload();
        int resI;
        double resD;
        ob.ovlDemo();
        System.out.println();
        ob.ovlDemo(2);
        System.out.println();
        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ovlDemo(4, 6): " +
                resI);
        System.out.println();
        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of ob.ovlDemo(1.1, 2.32): " +
                resD);
    }

    public static void typeConv() {
        Overload2 ob = new Overload2();
        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;
        ob.f(i);
        ob.f(d);
        ob.f(b);
        ob.f(s);
        ob.f(f);
    }

    public static void overloadConsDemo() {
        MyClass tl = new MyClass();
        MyClass t2 = new MyClass(88);
        MyClass t3 = new MyClass(17.23);
        MyClass t4 = new MyClass(2, 4);
        System.out.println("tl.x: " + tl.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);

    }

    public static void sumDemo() {
        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);
        System.out.println("si.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);

    }

    public static void staticDemo() {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();
// У каждого объекта имеется своя копия переменной экземпляра,
        ob1.x = 10;
        ob2.x = 20;

        System.out.println("Of course, obl.x and ob2.x " +
                "are independent.");
        System.out.println("obi.x: " + ob1.x +
                "\nob2.x: " + ob2.x);
        System.out.println();
// Все объекты совместно пользуются одной общей
// копией статической переменной.
        System.out.println("The static variable у is shared.");
        StaticDemo.y = 19;
        System.out.println("Set StaticDemo.y to 19.");
        System.out.println("obi. sum () : " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
        StaticDemo.y = 100;
        System.out.println("Change StaticDemo.y to 100");
        System.out.println("obi. sum () : " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }

    public static void SDemo3(){
        StaticBlock ob = new StaticBlock("Inside Constructor");
        System.out.println("Square root of 2 is " +
                StaticBlock.rootOf2);
        System.out.println("Square root of 3 is " +
                StaticBlock.rootOf3) ;

    }

    public static void QSDemo(){
        char a [ ] = {'d','x','a','r','p','j','i'};
        int i;
        System.out.print("Original array: ");
        for(i=0; i < a.length; i++)
        System.out.print(a[i]) ;
        System.out.println();
        // отсортировать массив
        QuickSort.qsort(a);
        System.out.print("Sorted array: ");
        for(i=0; i < a.length; i++)
            System.out.print(a[i]);

    }

    public static void nestedDemo(){

        int x[] = { 3, 2, 1, 5, 6, 9, 7, 8 };
        Outer outOb = new Outer(x);
        outOb.Analyze();

    }


}

