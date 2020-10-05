import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Centimeters: ");
        int centimeters = input.nextInt();

        int kilometers = centimeters/100000;
        centimeters %= 100000;
        int meters = centimeters / 100;
        centimeters %= 100;

        System.out.println("Kilometers: " + kilometers);
        System.out.println("Meters: " + meters);
        System.out.println("Centimeters: " + centimeters);

        input.close();
    }
}