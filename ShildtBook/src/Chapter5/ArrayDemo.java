package Chapter5;

/**
 * Created by ovo on 13.01.2016.
 */
public class ArrayDemo {
    public static void arrayDemo(){

        int sample[] = new int[10];
        int i;
        for(i = 0; i < 10; i = i+1)
        sample[i] = i;
        for(i =0; i < 10; i = i+1)
        System.out.println ("This is sample[" + i + "] : " + sample [i]);

    }
}
