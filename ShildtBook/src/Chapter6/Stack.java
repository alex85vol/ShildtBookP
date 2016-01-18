package Chapter6;

import java.io.IOException;

/**
 * Created by ovo on 18.01.2016.
 */
public class Stack {

    public static int enterLenght() throws IOException {
        int lenght = System.in.read();
        return lenght;


    }
    private char q[];
    private int putloc, getloc;
    Stack(int size) {
        q = new char[size+1];
        putloc = getloc = 0;
    }

    Stack(Stack ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
// копировать элементы очереди
        for(int i=getloc+1; i <= putloc; i++)
            q[i] = ob.q[i];
    }

    Stack(char a[])	{
        putloc = 0;
        getloc = 0;
        q = new char[a.length+1];
        for(int i = 0; i < a.length; i++) put(a[i]);
    }


    void put(char ch) {
        if(putloc==q.length-1) {
            System.out.println(" - Stack is full.");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
    // извлечь символ из очереди
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Stack is empty.");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
