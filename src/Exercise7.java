import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Side: ");
        double side = input.nextDouble();

        double perimeter = 6 * side;
        double area = 3 * Math.sqrt(3)/2 * Math.pow(side,2);

        System.out.printf("\nArea: %,.2f", area);
        System.out.printf("\nPerimeter : %,.2f", perimeter);

        input.close();
    }
}