package Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class swap_two_numbers {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in =  new Scanner(System.in);
        swap(arr, 1,2);

        for (int i = 0; i < arr.length; i++) {

        }

        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[] arr, int index1, int index2){
        int temp =arr[index1];
        arr[index1] =arr[index2];
        arr[index2] = temp;
    }
}

