reverse of three digit number 

import java.util.Scanner;

public class ReverseThreeDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();

        // Ensure the number is a three-digit number
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid three-digit number.");
        } else {
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int ones = number % 10;

            int reversed = ones * 100 + tens * 10 + hundreds;

            System.out.println("Reversed number: " + reversed);
        }

        scanner.close();
    }
}


output:
Enter a three-digit number: 345
Reversed number: 543
