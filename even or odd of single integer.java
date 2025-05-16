//Even or odd of single integer

import java.util.Scanner;

public class SingleDigitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single-digit integer (0–9): ");
        int num = scanner.nextInt();

        if (num < 0 || num > 9) {
            System.out.println("Invalid input! Please enter a single-digit integer.");
        } else if (num == 0) {
            System.out.println("zero");
        } else if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        scanner.close();
    }
}

output:
Enter a single-digit integer (0?9): 2
even


