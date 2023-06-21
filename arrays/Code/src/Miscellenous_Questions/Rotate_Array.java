// Q - Rotate a given array 'a' by K steps. where K is non-negative
// Note - K can be greater than n as well.( n is size of the array)

package Miscellenous_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {

        System.out.println("enter the size of array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("enter K: ");
        int k = in.nextInt();

        int[] ans = rotate(arr,k);
        System.out.println(Arrays.toString(ans));

    }
static int[] rotate (int[] arr, int k){
        int n = arr.length;
        k = k %n;
        int[] ans = new int[n];
        int j = 0;

    for (int i = n-k; i < n ; i++) {
        ans[j++] = arr[i];
    }

    for (int i = 0; i < n-k; i++) {
        ans[j++] = arr[i];
    }
    return ans;
}
    




}
