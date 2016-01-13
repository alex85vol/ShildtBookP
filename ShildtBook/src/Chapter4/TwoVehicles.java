package Chapter4;

/**
 * Created by ovo on 13.01.2016.
 */
public class TwoVehicles {



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


        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportcar.fuelcap * sportcar.mpg;
        System.out.print("Minivan can carry " + minivan.passengers + " passengers" +
                ". ");
        minivan.range();

        System.out.print("Sportscar can carry " + sportcar.passengers + " passengers" +
                ". ");

        sportcar.range();
    }


}
