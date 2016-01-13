package Chapter5;

/**
 * Created by ovo on 13.01.2016.
 */
public class Bubble {
    public static void bubble(){

        int nums[] = { 99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49 };
        int a, b, t;
        int size = nums.length;
        //size = 10;
        System.out.print("Original array is:");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        for(a=1; a < size; a++)
            for(b=size-1; b >= a; b--) {
            if(nums[b-1] > nums[b]) {
                t = nums[b-1];
                nums[b-1] = nums[b];
                nums[b] = t;
            }
        }

        System.out.print ("Sorted array is: ");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

    }
}
