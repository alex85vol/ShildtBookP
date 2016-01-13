package Learning;

/**
 * Created by ovo on 13.01.2016.
 */
public class LoopInLoop {
    public static void modernLoop(){
        for(int i=2; i <= 100; i++) {
            System.out.print("Factors of " + i + ": ") ;
            for(int j = 2; j < i; j++)
                if((i%j) == 0) System.out.print(j + " ");
            System.out.println() ;
        }
    }
    public static void modernLoop2() {
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.print("Factors of " + i + ": ");
            for (int j = 2; j < i; j++)
                if ((i % j) == 0) System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void modernLoop3() {
        for (int i = 1; i <= 100; i++) {
            System.out.print("Factors of " + i + ": ");
            for (int j = 1; j < i; j++)
                if ((i % j) != 0) System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void exampleLoop(){
        int i,x,y;
        x =1; y =4;
        boolean running = true;
        for(i =0; i < 10; i++)	{
            while(running) {
                if(x<y) break;

            }
            System.out.println("after while");
        }
        System.out.println("After for");
    }
    public static void exampleLoop2() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if ((i % 2) == 0) continue;
            System.out.println();

        }
    }
}
