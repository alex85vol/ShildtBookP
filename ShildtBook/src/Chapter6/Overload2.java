package Chapter6;

/**
 * Created by ovo on 15.01.2016.
 */
public class Overload2 {

    void f(byte x) {
        System.out.println("Inside f(byte): " + x);
    }

    void f(int x) {
        System.out.println("Inside f(int): " + x) ;
    }
    void f(double x) {
        System.out.println("Inside f(double): " + x) ;
    }

}
