package Miscellenous_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array_without_Space {
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

        rotateInPlace(arr,k);
        System.out.println(Arrays.toString(arr));
    }


    static void swapInArray(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr, int i , int j){
         i = 0;
         j = arr.length - 1;
        while (i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
//        System.out.println(Arrays.toString(arr));
    }
    static int[] rotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverseArray(arr,0,n-k-1);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-1);
        return arr;
    }


}
