import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        System.out.println("Welcome to the celsius to farenhiet converter ");
        System.out.println("enter celcius ");
        Scanner input = new Scanner(System.in);
        int celcius = input.nextInt();
        int farenhiet = (celcius * 9/5) + 32;

        System.out.println("Farenhiet conversion is: " + farenhiet);
    }
}
