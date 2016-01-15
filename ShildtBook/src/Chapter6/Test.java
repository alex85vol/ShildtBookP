package Chapter6;

/**
 * Created by ovo on 15.01.2016.
 */
public class Test {

    int a, b;
    Test(){}
    Test(int i, int j) {
        a = i;
        b = j;
    }

    void change(Test ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }


    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}
