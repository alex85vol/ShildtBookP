package Chapter5;

/**
 * Created by Demon on 13.01.2016.
 */
public class Queue {
    char q[];
    int putloc, getloc;
    Queue(int size) {
        q = new char[size+1];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if(putloc==q.length-1) {
            System.out.println(" - QueueCh6 is full.");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
    // извлечь символ из очереди
    char get() {
        if(getloc == putloc) {
            System.out.println(" - QueueCh6 is empty.");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}


