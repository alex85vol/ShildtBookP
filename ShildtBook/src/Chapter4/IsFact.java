package Chapter4;

/**
 * Created by ovo on 13.01.2016.
 */
public class IsFact {
    public static void isFact() {
        Factor x = new Factor();
        if (x.isFactor(2, 20)) System.out.println("2 is factor");
        if (x.isFactor(3, 20)) System.out.println("this won't be displayed");
    }

}
