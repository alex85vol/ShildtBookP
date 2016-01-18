package Chapter6;

/**
 * Created by ovo on 18.01.2016.
 */
public class ShowBits {
       static int numbits;
       ShowBits(int n) {
           numbits = n;
       }
      public static void show (long val){
                long mask = 1;
// сдвинуть влево для установки единицы в нужной позиции
          mask <<= numbits - 1;
          int spacer = 0;
          for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) System.out.print("I");
            else System.out.print("0");
            spacer++;
            if ((spacer % 8) == 0) {
               System.out.print(" ");
               spacer = 0;
               }
            }
                System.out.println();
        for(byte b = 0; b < 10; b++) {
        ShowBits byteval = new ShowBits(8);
        System.out.print(b + " in binary: ");
        byteval.show(b);

      }
   }
}

