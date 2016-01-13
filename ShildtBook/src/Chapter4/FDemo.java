package Chapter4;

/**
 * Created by ovo on 13.01.2016.
 */
public class FDemo {
    int x;
    FDemo(int i){
        x=i;
    }

    protected void finalize(){
        System.out.println("Finalizing" + x);
    }

    void generator(int i){
        FDemo o = new FDemo(i);
    }
}
