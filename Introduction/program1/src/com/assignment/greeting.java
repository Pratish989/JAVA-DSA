// Assignment 2 - Take name as input and print a greeting message for that particular name

package com.assignment;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Hello " + name + " Greetings for the festival");
    }
}
