package Chapter6;

/**
 * Created by ovo on 14.01.2016.
 */
public class FailSoftArray {
    private int a[];	//	Ссылка на массив.
    private int errval;	//	Значение, возвращаемое в	том	случае,	если
    // в методе get() будет обнаружена ошибка,
    public int length;	//	Переменная length	открыта.
    /* Конструктору данного	класса передается	размер	массива	и	значение,
    которое должен возвращать метод get () при обнаружении ошибки. */
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;}
// возвратить значение элемента массива по заданному индексу
    public int get(int index) {
// Отслеживание попытки обращения за границы массива.
        if(ok(index)) return a[index];
        return errval;}
// установить значение элемента no заданному индексу,
// если возникнет ошибка, возвратить логическое значение false
    public boolean put(int index, int val) {
// Отслеживание попытки обращения эа границы массива.
        if(ok(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }
    // возвратить логическое значение true, если индекс
// не выходит за границы массива
    private boolean ok(int index) {
        if (index >= 0 & index < length) return true;
        return false;
    }
}
