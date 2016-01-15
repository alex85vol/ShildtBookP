package Chapter6;

/**
 * Created by ovo on 15.01.2016.
 */
public class PassOb {

    public static void passOb(){
        Block ob1	=	new	Block(10, 2, 5) ;
        Block ob2	=	new	Block(10, 2, 5);
        Block ob3	=	new	Block(4, 5, 5);
// Здесь методам передаются объекты.
        System.out.println("ob1 same dimensions as ob2: " +
                ob1.sameBlock(ob2));
        System.out.println("ob1 same dimensions as ob3: " +
                ob1.sameBlock(ob3));
        System.out.println("ob1 same volume as ob3: " +
                ob1.sameVolume(ob3));
    }

    public static void callByValue(){
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a and b before call: " +
                a + " " + b) ;
        ob.noChange(a, b);
        System.out.println("a and b after call: " +
                a + " " + b) ;

    }

    public static void callByRef(){
        Test ob = new Test(15, 20);
        System.out.println("ob.a and ob.b before call: " +
                ob.a + " " + ob.b);
        ob.change(ob);
        System.out.println("ob.a and ob.b after call: " +
                ob.a + " " + ob.b);

    }

    public static void errorMsg(){
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));

    }

    public static void errInfo(){
        ErrorInfo err = new ErrorInfo();
        Err e;
        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severity: " + e.severity);
        e = err.getErrorInfo(19) ;
        System.out.println(e.msg + " severity: " + e.severity);

    }

    public static void overLoadDemo(){
        Overload ob = new Overload();
        int resI;
        double resD;
        ob.ovlDemo();
        System.out.println() ;
        ob.ovlDemo(2) ;
        System.out.println() ;
        resI = ob.ovlDemo(4, 6) ;
        System.out.println("Result of ob.ovlDemo(4, 6): " +
                resI);
        System.out.println() ;
        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of ob.ovlDemo(1.1, 2.32): " +
                resD);
    }

    public static void typeConv(){
        Overload2 ob = new Overload2();
        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;
        ob.f (i);
        ob.f(d);
        ob.f(b);
        ob.f(s);
        ob.f(f);
    }

    public static void overloadConsDemo(){
        MyClass	tl	=	new	MyClass();
        MyClass	t2	=	new	MyClass(88);
        MyClass	t3	=	new	MyClass(17.23);
        MyClass	t4	=	new	MyClass(2, 4);
        System.out.println("tl.x: " + tl.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);

    }

}

