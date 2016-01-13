package Learning;

/**
 * Created by Demon on 12.01.2016.
 */
public class SwitchDemo {

    public static void switchUsage() {
        int i;
        for(i=0; i < 10; i++){
            switch (i){
                case 0 : System.out.println("Zero");
                    break;
                case 1 : System.out.println("One");
                    break;

                case 2:
                case 3:
                case 4:
                    System.out.println("More than one");
                    break;
                default:
                    System.out.println("Between fiv and ten");
                    break;
            }


        }
    }
}
