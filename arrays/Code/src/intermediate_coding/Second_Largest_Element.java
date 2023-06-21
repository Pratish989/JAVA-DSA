// Q - Find the second largest element in array
// Given array -  {9,8,9,6,9,5,8}
package intermediate_coding;

import java.util.Arrays;

public class Second_Largest_Element {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int secondmax =0;
        int[] arr = {0,-2,0,-3,0,-4};

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= max){
                max = arr[i];
                arr[i] = Integer.MIN_VALUE;
            }
        }
        System.out.println(max);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= secondmax){
                secondmax = arr[i];

            }
        }

        System.out.println(secondmax);
        System.out.println(Arrays.toString(arr));


    }
}
