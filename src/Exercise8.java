import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Text: ");
        String string = input.nextLine();

        int length = string.length();
        int mid = string.length() / 2;

        String string1 = string.substring(0,mid);
        String string2 = string.substring(mid,length);

        String reverse = (string2 + string1).toUpperCase();

        System.out.printf("%n%s.", reverse);

        input.close();
    }
}