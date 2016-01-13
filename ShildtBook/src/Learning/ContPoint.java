package Learning;

/**
 * Created by ovo on 13.01.2016.
 */
public class ContPoint {
    public static void continuePoint() {
        outerloop:
        for (int i = 1; i < 10; i++) {
            System.out.print("\nOuter loop pass " + i +
                    ", Inner loop: ");
            for (int j = 1; j < 10; j++) {
                if (j == 5) continue outerloop; // продолжить внешний цикл
                System.out.print(j);

            }

        }
    }
}
