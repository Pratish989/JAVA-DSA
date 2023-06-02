// Assignment 1 - Write a Program to print whether a number is even or odd, also take input from user

package com.assignment;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        System.out.println("Check whether the number is even or odd");

        System.out.println("enter any number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println(" it is even");
        }else {
            System.out.println("it is odd");
        }
    }
}
