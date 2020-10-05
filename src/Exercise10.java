import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Whats your favorite city?: ");
        String city = input.nextLine();

        int length = city.length();
        String upper = city.toUpperCase();
        String lower = city.toLowerCase();


        System.out.print("\nText: " + city);
        System.out.print("\nLength: " + length);
        System.out.print("\nUpper: " + upper);
        System.out.print("\nLower: " + lower);

        input.close();
    }
}