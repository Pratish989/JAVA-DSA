package Concepts;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] arr = {34,43,23,24,54};
//        System.out.println(arr[4]);
        arr[4] = 99;
//        System.out.println(arr[4]);

        // input in array

//        int[] arr = new int[3];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }



        // 3 ways to print an array

        // 1st way - FOR LOOP
//        for (int i = 0; i < 5; i++) {
//            System.out.print(arr[i] + " ");
//        }


        // 2nd way - ADVANCED FOR LOOP
        for (int num : arr){ //for every element in array, print the element
            System.out.println(num); // here num represents element of array
        }


        // 3rd way - Arrays.toString method
        System.out.println(Arrays.toString(arr)); // this method --> Arrays.toString(arr) gives us something like this [1,2,3,4,5,6]
    }
}