//Assignmet 3 - Write a program to input principal, time and rate from user and fins simple interest

package com.assignment;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        System.out.println("enter Principal amount");
        Scanner input = new Scanner(System.in);
        float P = input.nextFloat();
        System.out.println("enter interest rate ");
        float R = input.nextFloat();
        System.out.println("enter time ");
        float T = input.nextFloat();

        float simpleinterest =  P*(1 + (R * T));
        System.out.println("simple interest is " + simpleinterest);
    }
}
