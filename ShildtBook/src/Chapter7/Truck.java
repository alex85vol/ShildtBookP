package Chapter7;

/**
 * Created by ovo on 21.01.2016.
 */
public class Truck extends Chapter7.Vehicle {
    private int cargocap; // грузоподъемность в фунтах
    // Конструктор класса Truck.
    Truck(int p, int f, int m, int c) {
/* Инициализация переменных из класса Vehicle
с помощью вызываемого конструктора этого класса. */
        super(p, f, m);
        cargocap = c;
    }
    // Методы доступа к переменной cargocap.
    int getCargo() { return cargocap; }
    void putCargo(int c) { cargocap = c; }

}
