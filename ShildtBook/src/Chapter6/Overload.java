package Chapter6;

/**
 * Created by ovo on 15.01.2016.
 */
public class Overload {
    void ovlDemo() {
        System.out.println("No parameters");
    }
    // перегрузить метод ovlDemo с одним параметром типа int.
// Второй вариант метода.
    void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }
    // перегрузить метод ovlDemo с двумя параметрами типа int.
// Третий вариант метода.
    int ovlDemo(int a, int b) {
        System.out.println("Two parameters: " + a + " " + b) ;
        return a + b;
    }
    // перегрузить метод ovlDemo с двумя параметрами типа double.
// Четвертый вариант метода.
    double ovlDemo(double a, double b) {
        System.out.println("Two double parameters: " +
                a + " " + b);
        return a + b;

    }
}
