import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hey what is your roll no?");
        Scanner input =  new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("Your roll no is: " + rollno);
    }
}
