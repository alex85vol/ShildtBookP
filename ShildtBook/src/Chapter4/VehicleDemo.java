package Chapter4;

/**
 * Created by ovo on 13.01.2016.
 */
public class VehicleDemo {

    public static void vehicleDemo(){
        int range;
        Vehicle minivan = new Vehicle();
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;

        System.out.println("Minivan can carry " + minivan.passengers + " passengers" +
                " with a range of " + range);


    }
}
