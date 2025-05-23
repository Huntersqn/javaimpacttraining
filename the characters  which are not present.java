the characters which are not present  in the first string but present in the second string are a cycle and hence the output is cycle.

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sum = 0;
        String number = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                number += ch;
            } else {
                if (!number.isEmpty()) {
                    sum += Integer.parseInt(number);
                    number = "";
                }
            }
        }

        // Add any remaining number
        if (!number.isEmpty()) {
            sum += Integer.parseInt(number);
        }

        System.out.println(sum);
    }
}

input:
abc
abcd
output:
cycle
