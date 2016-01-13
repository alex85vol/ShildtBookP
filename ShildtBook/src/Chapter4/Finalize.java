package Chapter4;

/**
 * Created by ovo on 13.01.2016.
 */
public class Finalize {
    public static void finalizeF(){

        int count;
        FDemo ob = new FDemo(0);

        for(count=1; count < 550000; count++)
            ob.generator(count);

    }
}
