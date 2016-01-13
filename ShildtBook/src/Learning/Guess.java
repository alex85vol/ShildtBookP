package Learning;

import java.io.IOException;

/**
 * Created by ovo on 12.01.2016.
 */
public class Guess {

    public static void yourChoice() throws IOException {

        char ch, answer = 'S';
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");
        ch = (char) System.in.read();
        if(ch == answer) System.out.println("** Right **");
        else {
            System.out.println("...Sorry, you're wrong.");
            if (ch < answer) System.out.println("You're to low");
            else System.out.println("You're to high");
        }

    }
}




