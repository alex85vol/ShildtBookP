package Chapter4;

/**
 * Created by ovo on 13.01.2016.
 */
public class Pwr {

    double b;
    int e;
    double val;

    Pwr(double base, int exp) {
        this.b = base;
        this.e = exp;
        val = 1;
        if(exp==0) return;
        for( ; exp>0; exp--) val = val * base;
        }
    double get_pwr() {
        return this.val;
        }

    }
