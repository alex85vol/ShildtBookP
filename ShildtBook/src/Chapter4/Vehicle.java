package Chapter4;

/**
 * Created by ovo on 13.01.2016.
 */
public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle() {

    }

    Vehicle(int p, int f, int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }


    int range(){
        //System.out.println("Range is: " + fuelcap*mpg);
        return fuelcap*mpg;
    }
    double fuelneeded (int miles){
        return (double) miles/mpg;
    }






}
