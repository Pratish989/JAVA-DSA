import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        System.out.println("Welcome to the Result Ceremony, where you enter your marks and get your results");

        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Enter your Science Marks: ");
        int science = input.nextInt();
        System.out.println("Enter your Maths Marks: ");
        int maths = input.nextInt();
        System.out.println("Enter your Social Studies Marks: ");
        int social = input.nextInt();
        System.out.println("Enter your English Marks: ");
        int english = input.nextInt();
        System.out.println("Enter your Computer Marks: ");
        int computer = input.nextInt();

        int result = (science + maths + social + english + computer)/5;

        System.out.println(name + "," + "your result is " + result + " percentage");

    }
}

