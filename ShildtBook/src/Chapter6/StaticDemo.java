package Chapter6;

/**
 * Created by ovo on 15.01.2016.
 */
public class StaticDemo {
    int x; // обычная переменная экземпляра
    static int y; // статическая переменная — это одна копия,
    // совместно используемая всеми объектами.
// возвратить сумму значений переменной экземпляра х и
// статической переменной у.
    int sum () {
        return x + y;
    }
}
