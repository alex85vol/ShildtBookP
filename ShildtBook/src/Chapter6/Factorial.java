package Chapter6;

/**
 * Created by ovo on 14.01.2016.
 */
public class Factorial {

    int factR(int n) {
        int result;
        if(n==1) return 1;
        System.out.println("n: " + n);
// Рекурсивный вызов метода factR.
        result = factR(n-1) * n;
        System.out.println("result: " + result);
        return result;
    }
    // Вариант программы, вычисляющий факториал итеративным способом,
    int factl(int n) {
        int t, result;
        result = 1;
        for (t = 1; t <= n; t++) result *= t;
        return result;
    }

}
