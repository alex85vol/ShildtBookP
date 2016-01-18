package Chapter6;

/**
 * Created by ovo on 18.01.2016.
 */
public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    // Этот блок выполняется при загрузке класса.
    static {
        System.out.println("Inside static block.");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);

    }
}
