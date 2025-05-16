//Jaffer wanted to excel in Math. He was learning about the Kaprekar number from Meena, his Maths teacher. She gave him a few random numbers and asked him to find out whether they are Kaprekar number or not.
//(Consider an n-digit number k. Square it and add the right n digits to the left n or n-1 digits. If the resultant sum is k, then k is called a Kaprekar number. For example, 9 is a Kaprekar number since 9^2 = 81 & 8 + 1 = 9, similarly, 297 is a Kaprekar number as 297^2 = 88209 & 88 + 209 = 297 ).

//Can you help Jaffer to write a program to find whether the given number is a Kaprekar number or not?
//Input Format

//Input consists of a single integer.

import java.util.Scanner;
public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isKaprekar(num)) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }
    }

    // Function to check if a number is Kaprekar
    public static boolean isKaprekar(int k) {
        if (k == 1) return true; // 1 is a Kaprekar number

        long square = (long) k * k;
        String squareStr = Long.toString(square);
        int len = squareStr.length();

        // Try splitting the square into two parts
        for (int i = 1; i < len; i++) {
            String left = squareStr.substring(0, i);
            String right = squareStr.substring(i);

            int leftPart = (left.isEmpty()) ? 0 : Integer.parseInt(left);
            int rightPart = Integer.parseInt(right);

            if (rightPart == 0) continue; // avoid division by 0 issues

            if (leftPart + rightPart == k) {
                return true;
            }
        }

        return false;
    }
}
   
                         or

import java.util.Scanner;

public class KaprekarCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();  // Input number
        scanner.close();

        if (isKaprekar(num)) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is not a Kaprekar number.");
        }
    }

    public static boolean isKaprekar(int num) {
        if (num == 1) return true; // 1 is a Kaprekar number

        int square = num * num;
        int temp = num;
        int digits = 0;

        // Count number of digits in the original number
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int divisor = (int) Math.pow(10, digits);

        if (divisor == 0) return false;

        int right = square % divisor;
        int left = square / divisor;

        return (right + left) == num;
    }
}


output:
9
Kaprekar number
