import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch(fruit){  // this is the example of enhanced switch case
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("red round fruit");
            case "orange" -> System.out.println("just like the name-- it is an orange color fruit");
            case "banana" -> System.out.println("banana");
            default -> System.out.println("Enter a valid Fruit");
        }
    }

}
