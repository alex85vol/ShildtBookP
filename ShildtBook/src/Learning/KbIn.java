package Learning;

import java.io.IOException;

/**
 * Created by ovo on 12.01.2016.
 */
public class KbIn {

    public static void keyBoard() throws IOException {
        char ch;
        System.out.print("Press a key followed by ENTER: ");

          ch = (char) System.in.read(); // получить значение типа char
        System.out.println("Your key is: " + ch);
        }

    public static void keyBoardModern() throws IOException {
        char ch;
        int count = 0;
        int countChar = 0;
        do {
            System.out.print("Press a key followed by ENTER: ");
            ch = (char) System.in.read();
            System.out.println("Your key is: " + ch);
           // if ((ch ==  )
            if (ch == ' ') count++;

        }   while (ch !='.');
        System.out.println(count);


        }


    }


