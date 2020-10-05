import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Temperature");
        double temp = input.nextDouble();

        System.out.print("Wind Speed");
        double speed = input.nextDouble();

        double windChill = 35.74 + 0.6215 * temp + (0.4275* temp - 35.75)*Math.pow(speed, 0.16);

        System.out.printf("\nWind Chill: %,.2f", windChill);

        input.close();
    }
}