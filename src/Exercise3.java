import java.util.Scanner;

public class Exercise3 {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Length: ");
        double length = input.nextDouble();

        System.out.print("Width: ");
        double width = input.nextDouble();

        System.out.print("Diamaeter: ");
        double radius = input.nextDouble() / 2;

        double area = (length * width) - Math.PI*(Math.pow(radius, 2));
        System.out.printf("\nSurface Area: %,.2f", area);

        input.close();
    }
}