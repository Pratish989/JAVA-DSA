import java.util.Scanner;

public class sumof2 {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();
        double sum = num1 + num2;

        System.out.println("Sum of two numbers is: " + sum );
    }
}
