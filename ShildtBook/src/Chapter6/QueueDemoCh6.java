package Chapter6;

/**
 * Created by Demon on 13.01.2016.
 */
public class QueueDemoCh6 {

    public static void queueDemo(){
        QueueCh6 bigQ = new QueueCh6(100);
        QueueCh6 smallQ = new QueueCh6(4);
        char ch;
        int i;
        System.out.println("Using bigQ to store the alphabet.");
// поместить буквенные символы в очередь bigQ
        for(i=0; i < 26; i++)
            bigQ.put((char) ('A' + i));
// извлечь буквенные символы из очереди bigQ и отобразить
        System.out.print("Contents of bigQ: ");
        for(i=0; i < 26; i++)	{
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("Using smallQ to generate errors.");
// использовать небольшую очередь smallQ для генерации ошибок
        for(i=0; i < 5; i++) {
            System.out.print("Attempting to store " +
                    (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
                    System.out.println();
        }
        System.out.println();
// дополнительные ошибки при обращении к очереди smallQ
        System.out.print("Contents of smallQ: ");
        for(i=0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }
    }
}
