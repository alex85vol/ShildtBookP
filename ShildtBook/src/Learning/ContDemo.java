package Learning;

/**
 * Created by ovo on 13.01.2016.
 */
public class ContDemo {
    public static void continueD(){
        int i;
        for ( i = 0; i < 100 ; i++) {
            if((i%2) !=0) continue;
            System.out.println(i);

        }
    }
}
