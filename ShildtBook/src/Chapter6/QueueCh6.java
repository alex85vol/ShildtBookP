package Chapter6;

/**
 * Created by Demon on 13.01.2016.
 */
public class QueueCh6 {
    private char q[];
    private int putloc, getloc;
    QueueCh6(int size) {
        q = new char[size+1];
        putloc = getloc = 0;
    }

    QueueCh6(QueueCh6 ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
// копировать элементы очереди
        for(int i=getloc+1; i <= putloc; i++)
            q[i] = ob.q[i];
    }

    QueueCh6(char a[])	{
        putloc = 0;
        getloc = 0;
        q = new char[a.length+1];
        for(int i = 0; i < a.length; i++) put(a[i]);
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


