import java.util.Scanner;

public class l2pp2 {

    // Recursive method
    public static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    // Formula method
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Validation
        if (n <= 0) {
            System.out.println("Please enter a natural number (> 0)");
            return;
        }

        int recResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        System.out.println("Sum using recursion: " + recResult);
        System.out.println("Sum using formula: " + formulaResult);

        // Compare results
        if (recResult == formulaResult) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Mismatch in results.");
        }
    }
}