import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double gallons = 0, mpg = 0, price = 0;
        boolean done;
        String trash;

        // Gallons
        done = false;
        do {
            System.out.print("Enter gallons in tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid: " + trash);
            }
        } while (!done);

        // MPG
        done = false;
        do {
            System.out.print("Enter fuel efficiency (mpg): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid: " + trash);
            }
        } while (!done);

        // Price
        done = false;
        do {
            System.out.print("Enter price per gallon: ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid: " + trash);
            }
        } while (!done);

        double cost100 = (100.0 / mpg) * price;
        double range = gallons * mpg;

        System.out.println("Cost to drive 100 miles: $" + cost100);
        System.out.println("Distance with full tank: " + range + " miles");
    }
}
