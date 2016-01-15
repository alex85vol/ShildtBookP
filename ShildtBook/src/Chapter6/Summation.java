package Chapter6;

/**
 * Created by ovo on 15.01.2016.
 */
public class Summation {

    int sum;
    // построить объект из целочисленного значения
    Summation(int num) {
        sum = 0;
        for (int i = 1; i <= num; i++)
            sum += i;
        }
    Summation(Summation ob) {
        sum = ob.sum;
    }
}
