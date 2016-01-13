package Chapter5;

/**
 * Created by ovo on 13.01.2016.
 */
public class ArrayError {
    public static void arrayError(){
        int sample[] = new int[10];
        int i;
// воссоздать превышение границ массива
        for(i =0; i < 100; i = i+1)
            sample[i] = i;

    }
}
