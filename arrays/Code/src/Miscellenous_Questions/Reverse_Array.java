package Miscellenous_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        System.out.println("enter the size of array: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));


        reverseArray(arr);

//        int ans[] = reverse(arr);
//        for (int i = 0; i < ans.length; i++) {
//            System.out.println(ans[i] + " ");
//
//        }
//        System.out.println(Arrays.toString(ans));

    }



    // we created this method, but it uses another memory component. and we dont want to create that. we want to have in place value reverese


//    static int[] reverse(int[] arr){
//        int n = arr.length;
//        int [] ans = new int[n];
//        int j = 0;
//        // traverse the original array from reverse direction
//        for (int i = arr.length-1; i >= 0 ; i--) {
//            ans[j++] = arr[i];
//        }
//        return ans;
////        System.out.println(arr);
//    }

    //  NOW WE WILL CREATE A METHOD WHICH WILL SWAP THE FIRST VALUE TO LAST AND THEN SECOND VALUE TO SECOND LAST AND SO ON.
    // SO THAT WE CAN ACHIEVE WHAT WE WANTED IN THAT FIRST PLACE WITHOUT USING NEW MEMORY

    static void swapInArray(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr){
        int i = 0;
        int j = arr.length - 1;
         while (i<j){
             swapInArray(arr,i,j);
             i++;
             j--;
         }
        System.out.println(Arrays.toString(arr));
    }


}




