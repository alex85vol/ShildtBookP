package Chapter6;

/**
 * Created by ovo on 14.01.2016.
 */
public class Main {

    public static void main(String[] args) {
        //Access.accessDemo();
        //Access.fsDemo();
        //Access.recursiveOn();
        QueueDemoCh6.queueDemo();
        //PassOb.passOb();
        //PassOb.callByValue();
        //PassOb.callByRef();
        //PassOb.errorMsg();
        //PassOb.errInfo();
        //PassOb.overLoadDemo();
        //PassOb.typeConv();
        //PassOb.overloadConsDemo();
        //PassOb.sumDemo();
        //QueueDemoCh6.queueDemo2();
        //PassOb.staticDemo();
        //PassOb.SDemo3();
        //PassOb.QSDemo();
        //PassOb.nestedDemo();
       /* class ShowBits {
            int numbits;

            ShowBits(int n) {
                numbits = n;
            }

            void show(long val) {
                long mask = 1;
// сдвинуть влево для установки единицы в нужной позиции
                mask <<= numbits - 1;
                int spacer = 0;
                for (; mask != 0; mask >>>=1){
                    if ((val & mask) != 0) System.out.print("1");
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
        for (byte b = 0; b < 10; b++) {
            ShowBits byteval = new ShowBits(8);
            System.out.print(b + " in binary: ");
            byteval.show(b);
        }*/

        }
    }
