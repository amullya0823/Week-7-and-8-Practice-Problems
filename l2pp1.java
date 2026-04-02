import java.util.Scanner;

public class l2pp1 {

    // Method to get factors
    public static int[] getFactors(int num) {
        int count = 0;

        // First loop → count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        // Create array
        int[] factors = new int[count];
        int index = 0;

        // Second loop → store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Sum of factors
    public static int sum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    // Product of factors
    public static int product(int[] arr) {
        int prod = 1;
        for (int x : arr) {
            prod *= x;
        }
        return prod;
    }

    // Sum of squares of factors
    public static double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int x : arr) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = getFactors(num);

        // Display factors
        System.out.print("Factors: ");
        for (int x : factors) {
            System.out.print(x + " ");
        }

        System.out.println("\nSum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
    }
}