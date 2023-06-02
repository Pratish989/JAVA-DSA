import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String Department = in.next();

        switch(empID){
            case 1 -> System.out.println("Pratish");
            case 2 -> System.out.println("Maharshi");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (Department){
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println(" Enter Valid department");

                }
            }
            default -> System.out.println("Enter Correct Employe id");
        }
    }
}
