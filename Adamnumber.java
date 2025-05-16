//find whether the number is adam or not the sqaure of the given number is eqaul to the reverse of the sqaure in java

import java.util.Scanner;
public class AdamNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Step 1: Reverse the original number
        int reversedNum = reverse(num);

        // Step 2: Square of original and reversed numbers
        int squareOriginal = num * num;
        int squareReversed = reversedNum * reversedNum;

        // Step 3: Reverse the square of reversed number
        int reversedSquare = reverse(squareReversed);

        // Step 4: Compare
        if (squareOriginal == reversedSquare) {
            System.out.println(num + " is an Adam Number");
        } else {
            System.out.println(num + " is NOT an Adam Number");
        }
    }

    // Helper method to reverse a number
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}


output:
Enter a number: 12
Adam number
