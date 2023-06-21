// Swap two numbers

package Miscellenous_Questions;

import java.util.Scanner;

public class Swap_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = in.nextInt();
        System.out.println("enter the second number");
        int b = in.nextInt();
        int[] arr = { 1,2,3,4,5};
        swap_1(a,b);
    }


    // Swap two Numbers Using temp variable
//    static void swap(int a, int b){
//        System.out.println("The Original Values: ");
//        System.out.println("Original value of a is : " + a );
//        System.out.println("Original value of b is : " + b );
//
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("The replaced value of a is : " + a );
//        System.out.println("The replaced value of b is : " + b );
//    }

    // Swap two numbers using sum and difference method
    static void swap_1(int a, int b){
        System.out.println("Original value of a is : " + a );
        System.out.println("Original value of b is : " + b );

        a = a + b;
        b = a-b;
        a = a -b;



        System.out.println("The replaced value of a is : " + a );
        System.out.println("The replaced value of b is : " + b );
    }


}
