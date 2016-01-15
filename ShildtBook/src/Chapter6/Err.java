package Chapter6;

/**
 * Created by ovo on 15.01.2016.
 */
public class Err {
    String msg; // Сообщение об ошибке
    int severity; // Код, определяющий серьезность ошибки
    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}
