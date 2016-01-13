package Chapter5;

/**
 * Created by ovo on 13.01.2016.
 */
public class TwoDim {
    public static void twoD() {
        int t, i;
        int table[][] = new int[3][4];
        for (t = 0; t < 3; ++t) {
            for (i = 0; i < 4; ++i) {
                table[t][i] = (t * 4) + i + 1;
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }
    }

    public static void twoD2(){
        int sqrs[][] = {
                { 1, 1 },
                { 2, 4 },
                { 3, 9 },
                { 4, 16 },
                { 5, 25 },
                { 6, 36 },
                { 7, 49 },
                { 8, 64 },
                { 9, 81 },
                { 10, 100 }
        };
        int i, j;
        for(i=0; i < 10; i++) {
            for (j = 0; j < 2; j++)
                System.out.print(sqrs[i][j] + " ");
            System.out.println();
        }
    }

    public static void AssignARef(){
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];
        for(i=0; i < 10; i++)
            nums1[i] = i;
        for(i=0; i < 10; i++)
            nums2[i] = -i;
        System.out.print("Here is numsl: ");
        for(i=0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
        System.out.print("Here is nums2: ");
        for(i=0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();
// присвоить ссылку на массив
// Теперь переменные nums2 и numsl ссылаются
//на один и тот же массив.
        nums2 = nums1;
        System.out.print("Here is nums2 after assignment: ");
        for(i=0; i < 10; i++)
        System.out.print(nums2[i] + " ");
        System.out.println() ;
// выполнить операции над массивом numsl
// по ссылке на массив nums2.
        nums2[3] = 99;
        System.out.print("Here is numsl after change through nums2: ");
        for(i=0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

    }

    public static void lenghtDemo(){

        int list[] = new int[10];
        int nums[] = { 1, 2, 3 };
        int table[][] = { // таблица со строками переменной длины
            {1, 2, 3},
            { 4, 5 },
            {6, 7, 8, 9}
        };
        System.out.println("length of list is " + list.length);
        System.out.println("length of nums is " + nums.length);
        System.out.println("length of table is " + table.length);
        System.out.println("length of table[0] is "	+ table[0].length);
        System.out.println("length of table[l] is "	+ table[1].length);
        System.out.println("length of table[2] is "	+ table[2].length);
        System.out.println() ;
// использовать переменную length для инициализации списка
// Переменная length служит для управления циклом for.
        for(int i=0; i < list.length; i++)
            list[i] = i * i;
        System.out.print("Here is list: ");
        for (int i=0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println() ;

    }

    public static void ACopy(){
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];
        for(i=0; i < nums1.length; i++)
            nums1[i] = i;
// копировать массив numsl в массив nums2
// Переменная length служит для сравнения размеров массивов.
        if(nums2.length >= nums1.length)
        for(i =0; i < nums2.length; i++)
            nums2[i] = nums1[i];
        for(i=0; i < nums2.length; i++)
            System.out.print(nums2[i] + " ");

    }
}
