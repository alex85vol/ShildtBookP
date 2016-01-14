package Chapter6;

/**
 * Created by ovo on 14.01.2016.
 */
public class Access {

    public static void accessDemo(){
        MyClass ob = new MyClass();
/* Доступ к переменной alpha возможен только с помощью
специально предназначенных для этой цели методов. */
        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());
// Обратиться к переменной alpha так, как показано ниже, нельзя.
// ob.alpha =10; // Ошибка! alpha - закрытая переменная!
// Следующие обращения вполне допустимы, так как
// переменные beta и gamma являются открытыми,
        ob.beta = 88;
        ob.gamma = 99;

    }

    public static void fsDemo() {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;
// выявить скрытые сбои при обращении к массиву
        System.out.println("Fail quietly.");
        for (int i = 0; i < (fs.length * 2); i++)
// Доступ к массиву должен осуществляться с помощью
// специально предназначенных для этого методов,
            fs.put(i, i * 10);
        for (int i = 0; i < (fs.length * 2); i++) {
// Доступ к массиву должен осуществляться с помощью
// специально предназначенных для этого методов.
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
        }
        System.out.println("");
// а теперь обработать сбои и вывести сообщения об ошибках
        System.out.println("\nFail with error reports.");
        for (int i = 0; i < (fs.length * 2); i++)
            if (!fs.put(i, i * 10))
                System.out.println("Index " + i + " out-of-bounds");
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else
                System.out.println("Index " + i + " out-of-bounds");

        }
    }

}
