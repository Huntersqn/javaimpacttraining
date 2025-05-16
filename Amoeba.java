The Research team led by Bernadette Wolowitz at Cal-tech University has discovered a new Amoeba that grows in the order of a Fibonacci series every month. They are exhibiting this amoeba at a national conference. They want to know the size of the amoeba at a particular time instant. If a particular month’s index is given, write a program to display the amoeba’s size.

For Example, the size of the amoeba in months 1, 2, 3, 4, 5, 6,... will be 0, 1, 1, 2, 3, 5, 8.... respectively.
import java.util.Scanner;

public class AmoebaGrowth {
    public static int amoebaSize(int month) {
        if (month <= 0) {
            throw new IllegalArgumentException("Month index must be greater than or equal to 1.");
        } else if (month == 1) {
            return 0;
        } else if (month == 2) {
            return 1;
        } else {
            int a = 0, b = 1, c = 0;
            for (int i = 3; i <= month; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month index: ");
        int month = scanner.nextInt();

        try {
            int size = amoebaSize(month);
            System.out.println("The size of the amoeba in month " + month + " is: " + size);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

output:
Enter the month index: 6
The size of the amoeba in month 6 is: 5
