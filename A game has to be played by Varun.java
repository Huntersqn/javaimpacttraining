A game has to be played by Varun whereas he is not supposed to take the chara add the numbers given in a string containing alphanumeric characters. If he add Help him to win the game by writing a program to print the sum of numbers Input Format: Input consists of one string. Output Format: The Output consists of one integer that corresponds to the sum of all numbers

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
abc12x3y7z45
output:
67