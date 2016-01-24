package Chapter8;

/**
 * Created by Demon on 24.01.2016.
 */
public class ByTwos2 implements Series {
    int start;
    int val;
    int prev;
    ByTwos2()	{
        start = 0;
        val = 0;
        prev = -2;
    }
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }
    public void reset()	{
        start = 0;
        val = 0;
        prev = -2;
    }
    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }
    // Добавление метода, не объявленного в интерфейсе Series.
    int getPrevious(){
        return prev;
    }
}
