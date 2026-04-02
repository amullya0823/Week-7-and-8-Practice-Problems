import java.util.Scanner;

public class l1pp2 {

    // Method to calculate handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // Method call
        int handshakes = calculateHandshakes(students);

        // Output
        System.out.println("Maximum number of handshakes: " + handshakes);
    }
}