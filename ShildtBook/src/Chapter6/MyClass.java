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
}
