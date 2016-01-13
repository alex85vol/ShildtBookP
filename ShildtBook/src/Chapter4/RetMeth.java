package Chapter4;

/**
 * Created by ovo on 13.01.2016.
 */
public class RetMeth {
    public static void twoVehicles() {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();


        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;


        range1 = minivan.range();
        range2 = sportcar.range();
        System.out.println("Minivan can carry " + minivan.passengers + " passengers" +
                " with range of " + range1 + " Miles.");


        System.out.println("Sportscar can carry " + sportcar.passengers + " passengers" +
                " with range of " + range2 + " Miles.");

        if(range1 > range2) {
            System.out.println("Range of minivan is greater than sportcar");
        }else{
            System.out.println("Range of minivan is less than sportcar");
        }

    }
}
