// Q - Find the total numbers of pairs in the array whose sum is equal to the value of x.
// Array - [4,6,3,5,8,2]  Target = 7  ans -> 2 , (4,3)(5,2)

package intermediate_coding;

import java.util.Arrays;

public class Target_Sum_Two_Numbers {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 5, 8, 2};
        int[] arr_2 = arr.clone();
        int target = 7;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {    // MISTAKE - I was trying to make a copy of the whole array and i was trying to compare the arrays.
            for (int j = i + 1; j < arr.length; j++) {  // Simple concept here that we have to run two loops. one for fixing the number and then second for traversing other elements in the array.
                if (arr[i] + arr[j] == target) {
                    int[] ans = {arr[i], arr[j]};
                    count++;
                    System.out.println(Arrays.toString(ans));
                }


            }

        }

        System.out.println("The number of pairs in that is: " + count);

//        for (int i = 1; i < arr.length; i++)
//
//            if( arr[i] + arr[0] == target){
//                count++;
//                System.out.println(count);
//            }
//        }


//    }

    }
}