// Assignmet 4 - take in two numbers and an operator (+ - / *) and calculate the value (use if conditions)

package com.assignment;

import java.util.Scanner;
public class operator {
    public static void main(String[] args) {
        System.out.println("enter 1st number");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("enter 2nd number");
        int num2 = input.nextInt();
        System.out.println(" Select operator");
        String operator = input.next();
        int result;
        if(operator == "add" ){
            result =  num1 + num2;
            System.out.println(result);
        } else if (operator == " - ") {
            result = num1 - num2;
            System.out.println(result);
        } else if (operator == " * ") {
            result = num1 * num2;
            System.out.println(result);
        } else {
            result = num1/num2;
            System.out.println(result);
        }
    }
}
