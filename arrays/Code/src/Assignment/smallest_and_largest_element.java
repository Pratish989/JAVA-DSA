package Assignment;
import java.util.Arrays;

public class smallest_and_largest_element {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,6,3,5,7};
        int[] ans =smallestAndLargestElement(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        int[] ans = {arr[0],arr[arr.length - 1]};
//        System.out.println(ans);

    }
        static int[] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans ={arr[0], arr[arr.length -1]};
        return ans;
        }
}
