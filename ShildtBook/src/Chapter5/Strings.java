package Chapter5;

/**
 * Created by ovo on 14.01.2016.
 */
public class Strings {
    public static void stringDemo1(){

        String str1 = new String("Java strings are objects.");
        String str2 = "They are constructed various ways.";
        String str3 = new String(str2);
        System.out.println(str1) ;
        System.out.println(str2) ;
        System.out.println(str3) ;
    }

    public static void stringOps(){
        String strl= "When it comes to Web programming, Java is #1.";
        String str2 = new String(strl);
        String str3 = "Java strings are powerful.";
        int result, idx;
        char ch;
        System.out.println("Length of strl: " +
                strl.length());
// отобразить строку strl посимвольно,
        for(int i=0; i < strl.length(); i++)
            System.out.print(strl.charAt(i));
        System.out.println();
        if (strl.equals(str2) )
            System.out.println("strl equals str2");
        else
            System.out.println("strl does not equal str2");
        if(strl.equals(str3))
            System.out.println("strl equals str3");
        else
            System.out.println("strl does not equal str3");
        result = strl.compareTo(str3);
        if (result == 0)
            System.out.println("strl and str3 are equal");
        else if(result < 0)
            System.out.println("strl is less than str3");
        else
            System.out.println("strl is greater than str3");
// присвоить переменной str2 новую строку
        str2 = "One Two Three One";
        idx = str2.indexOf("One");
        System.out.println("Index of first occurrence of One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Index of last occurrence of One: " + idx);
    }

    public static void stringArrays(){
        String strs[] = { "This", "is", "a", "test." };
        System.out.println("Original array: ");
        for(String s : strs)
            System.out.print (s + " ");
        System.out.println("\n");
// изменить символьную строку
        strs[1] = "was";
        strs[3] = "test, too!";
        System.out.println("Modified array: ");
        for(String s : strs)
            System.out.print(s + " ");
    }

    public static void subString(){
         String orgstr = "Java makes the Web move.";
// сформировать подстроку
// Здесь создается новая строка, содержащая нужную подстроку.
            String substr = orgstr.substring(5, 18);
            System.out.println("orgstr: " + orgstr);
            System.out.println("substr: " + substr);

        }

    public static void stringSwitch(){
        String command = "cancel";
        switch(command) {
            case "connect":
                System.out.println("Connecting");
                break;
            case "cancel":
                System.out.println("Canceling");
                break;
            case "disconnect":
                System.out.println("Disconnecting");
                break;
            default:
                System.out.println("Command Error!");
                break;
            }
        }

    public static void upCase() {

        char ch;
        for (int i = 0; i < 26; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);
// В следующем операторе сбрасывается шестой бит.
// После этого в переменной ch будет храниться код
// символа прописной буквы,
            ch = (char) ((int) ch & 65503);
            System.out.print(ch + " ");
        }
    }

    public static void showBits() {

        int t;
        byte val;
        val = 123;
        for (t = 128; t > 0; t = t / 2) {
            if ((val & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }

    public static void lowCase() {

        char ch;
        for (int i = 0; i < 26; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);
// В следующем операторе устанавливается шестой бит,
// в итоге переменная ch содержит код символа строчной буквы,
            ch = (char) ((int) ch | 32);
            System.out.print(ch + " ");
        }
    }

    public static void encriptionDemo(){
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;
        System.out.print("Original message: ");
        System.out.println(msg);
// зашифровать сообщение
        for (int i=0; i < msg.length(); i++)
// Построение зашифрованной строки сообщения,
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        System.out.print("Encoded message: ");
        System.out.println(encmsg) ;
// дешифровать сообщение
        for(int i=0; i < msg.length(); i++)
// Построение дешифрованной строки сообщения.
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        System.out.print("Decoded message: ");
        System.out.println(decmsg);

    }
}
