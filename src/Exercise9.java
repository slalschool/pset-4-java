import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First name: ");
        String firstName = input.nextLine();

        System.out.print("Middle name: ");
        String middleName = input.nextLine();

        System.out.print("Last name: ");
        String lastName = input.nextLine();

        String intials = (firstName.substring(0,1) + middleName.charAt(0) + lastName.substring(0,1));

        System.out.print(intials.toUpperCase() + ".");

        input.close();
    }
}