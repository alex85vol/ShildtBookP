package Chapter4;

import java.io.IOException;

/**
 * Created by ovo on 13.01.2016.
 */
public class HelpClassDemo {

    public static void helpClass() throws IOException {

        char choice, ignore;
        Help hlpobj = new Help();
        for (; ; ) {
            do {
                hlpobj.showmenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!hlpobj.isvalid(choice));
            if (choice == 'q') break;
            System.out.println("\n");
            hlpobj.helpon(choice);
        }
    }
}
