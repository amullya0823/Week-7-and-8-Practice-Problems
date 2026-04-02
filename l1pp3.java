import java.util.Scanner;

public class l1pp3 {

    // Method to calculate rounds
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        // Method call
        double rounds = calculateRounds(a, b, c);

        // Output
        System.out.println("Number of rounds required to complete 5 km: " + rounds);
    }
}