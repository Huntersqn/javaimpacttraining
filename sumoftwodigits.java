import java.util.Scanner;

public class SumTwoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two digits
        System.out.print("Enter first digit: ");
        int digit1 = scanner.nextInt();

        System.out.print("Enter second digit: ");
        int digit2 = scanner.nextInt();

        // Calculate sum
        int sum = digit1 + digit2;

        // Output result
        System.out.println("The sum of the two digits is: " + sum);

        scanner.close();
    }
}
 
output:
Enter first digit: 4
Enter second digit: 7
The sum of the two digits is: 11
