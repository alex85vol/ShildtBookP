package Chapter6;

/**
 * Created by ovo on 15.01.2016.
 */
public class Block {

    int a, b, c;
    int volume;
    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }
    boolean sameBlock(Block ob) {
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }
    // возвратить логическое значение true, если
// параметр ob определяет параллелепипед такого же объема
//В качестве параметра методу передается объект.
    boolean sameVolume(Block ob) {
        if(ob.volume == volume) return true;
        else return false;
    }

}
