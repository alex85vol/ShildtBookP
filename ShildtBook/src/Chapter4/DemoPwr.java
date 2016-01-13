package Chapter4;

/**
 * Created by ovo on 13.01.2016.
 */
public class DemoPwr {
    public static void demoPwr(){
        Pwr x	=	new	Pwr(4.0, 2);
        Pwr y	=	new	Pwr(2.5, 1);
        Pwr z	=	new	Pwr(5.7, 0);
        System.out.println(x.b + " raised to the " + x.e +
                " power is " + x.get_pwr());
        System.out.println(y.b + " raised to the " + y.e +
                " power is " +  y.get_pwr());
        System.out.println(z.b + " raised to the " + z.e +
                " power is " + z.get_pwr());
        }
    }
