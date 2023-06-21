// Q - Count the numbers of triplets wjhose sum would be equal to the given value of x (target)
//  array - {1,4,5,6,3}  Target = 12  ans = 3 -> (0

package intermediate_coding;

import java.util.Arrays;

public class Target_Sum_Triplet {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3};
        int count = 0;
        int target = 12;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target){
                        int ans[] = {arr[i], arr[j] , arr[k]};
                        count++;
                        System.out.println(Arrays.toString(ans));

                    }
                }
            }
        }
        System.out.println(count);
    }
}
