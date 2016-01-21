package Chapter7;

/**
 * Created by ovo on 21.01.2016.
 */
public class Vehicle {
    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle() {}

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


    int getPassengers()	{ return passengers; }
    void setPassengers(int p) { passengers = p; }
    int getFuelcap() { return fuelcap; }
    void setFuelcap(int f) { fuelcap = f; }
    int getMpg() { return mpg; }
    void setMpg(int m) { mpg = m; }

}
