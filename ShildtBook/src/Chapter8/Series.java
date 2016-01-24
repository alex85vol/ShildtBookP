package Chapter8;

/**
 * Created by Demon on 24.01.2016.
 */
public interface Series {
    int getNext(); // возвратить следующее по порядку число
    void reset(); // начать все с самого сначала
    void setStart(int х); // задать начальное значение

}
