package Learning;

/**
 * Created by ovo on 12.01.2016.
 */
public class LogicalOpTable {

    public static void LogicalOpTable() {
        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
                p = true; q = true;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        p = true; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        p = false; q = true;
        System.out.print (p + "n\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "M\t" + (!p));
        p = false; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
    }

}



