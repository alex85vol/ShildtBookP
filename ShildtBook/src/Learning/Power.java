package Learning;

/**
 * Created by Demon on 12.01.2016.
 */
public class Power {
    public static void powerR(){

        int e;
        int result;
        for(int i=0; i < 10; i++) {
            result = 1;
            e = i;
            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2 to the " + i +
                    " power is " + result);
            }
        }
}
