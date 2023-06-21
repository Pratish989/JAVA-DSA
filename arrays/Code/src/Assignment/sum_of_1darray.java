package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class sum_of_1darray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int ans = arr[i] ;
            System.out.println(ans);
        }



    }
}
