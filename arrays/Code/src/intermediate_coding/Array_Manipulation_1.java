// Q - Find the unique number in a given array where all the elements are being repeated twice with one value being unique
// Condition - only the positive numbers are allowed
// Array = { 1,2,3, 4, 2,1,3}
package intermediate_coding;

import java.util.Arrays;

public class Array_Manipulation_1 {
    public static void main(String[] args) {
        int[] arr = { 1,2,3, 4, 2,1,3};
        System.out.println("The original array is: " + Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {
//            int ans = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                } 
            }

        }

        System.out.println("The new array formed is: " + Arrays.toString(arr));
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >  0){
                 ans = arr[i] ;
            }
        }
        System.out.println("The element which is unique is: " + ans);
    }
   
}
