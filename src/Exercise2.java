import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inches: ");
        int inches = input.nextInt();

        int miles = (inches - inches %(5280*12))/(5280*12);
        inches -= miles*(5280*12);

        int feet = (inches - inches%(12))/(12);
        inches -= feet*(12);

        System.out.print("Miles: " + miles);
        System.out.print("Feet: " + feet);
        System.out.print("Inches: " + inches);

        input.close();
    }

}