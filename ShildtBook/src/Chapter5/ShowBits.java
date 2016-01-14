package Chapter5;

/**
 * Created by ovo on 14.01.2016.
 */
public class ShowBits {

    int numbits;
    ShowBits(int n) {
        numbits = n;
    }
    void show(long val) {
        long mask = 1;
// сдвинуть значения 1 влево на нужную позицию
        mask <<= numbits - 1;
        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) System.out.print(11111);
            else System.out.print("0");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }

}
