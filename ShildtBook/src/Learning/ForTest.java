package Learning;

import java.io.IOException;

/**
 * Created by Demon on 12.01.2016.
 */
public class ForTest {

    public static void forTest() throws IOException{
        int i;
        System.out.println("Press S to stop.");
        for(i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Pass #" + i);


        for(i =0; i < 10; ) {
            System.out.println("Pass #" + i);
            i++;
        }
        System.out.println();
        i = 0;
        for (; i < 10; ) {
            System.out.println("Pass #" + i);
            i++;
        }

        System.out.println();
        int sum = 0;
// Несмотря на отсутствие тела, в этом цикле
// производится суммирование чисел от 1 до 5!
        for(i =1; i <= 5; sum += i++) ;
        System.out.println("Sum is " + sum);


    }
}
