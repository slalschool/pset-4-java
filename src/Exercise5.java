import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Diameter: ");
        double diameter = input.nextDouble();
        double circumference = diameter * Math.PI;
        double area = Math.PI * Math.pow(diameter / 2, 2);

        System.out.printf("\nArea: %,.2f", area);
        System.out.printf("\nCircumference: %,.2f", circumference);

        input.close();
    }



}