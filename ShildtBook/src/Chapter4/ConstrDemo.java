package Chapter4;

/**
 * Created by ovo on 13.01.2016.
 */
public class ConstrDemo {
    public static void constrDemo(){
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);
    }

    public static void paramConstrDemo(){
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(88);

        System.out.println(t1.x + " " + t2.x);
    }


}
