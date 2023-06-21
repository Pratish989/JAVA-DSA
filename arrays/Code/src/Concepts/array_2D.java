package Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

        //  my input array
//        arr = new int[][]{
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//
//        System.out.println(arr[2][2]);

        // User input array

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // output of that array
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        // another way to output this array is
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }


    }
}
