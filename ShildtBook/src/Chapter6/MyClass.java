package Chapter6;

/**
 * Created by ovo on 14.01.2016.
 */
public class MyClass {
    private int alpha; // закрытый доступ
    public int beta; // открытый доступ
    int gamma;

    void setAlpha(int а) {
        alpha = а;
    }

    int getAlpha() {

        return alpha;
    }

    int x;

    MyClass() {
        System.out.println("Inside MyClass().");
        x = 0;
    }

    MyClass(int i) {
        System.out.println("Inside MyClass(int). ");
        x = i;
    }

    MyClass(double d) {
        System.out.println("Inside MyClass(double).");
        x = (int) d;
    }

    MyClass(int i, int j) {
        System.out.println("Inside MyClass(int, int).");
        x = i * j;
    }
}