//A company transfers an encrypted code to one of its clients. The code needs to be decrypted so that it can be used for accessing all the required information. The code can be decrypted by interchanging each consecutive digit and once a digit has been interchanged then it cannot be used again. If at a certain point there is no digit to be interchanged with, then the single digit must be left as it is.
Write an algorithm to decrypt the code so that it can be used to access the required information.
Input Format
The first line of the input consists of an integer - encrypted code, representing the encrypted code given to the client.
Output Format
Print an integer representing the decrypted code that can be used for accessing the required information


import java.util.Scanner;
public class DecryptCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encrypted = scanner.nextLine();
        StringBuilder decrypted = new StringBuilder();

        int i = 0;
        while (i < encrypted.length()) {
            if (i + 1 < encrypted.length()) {
                // Swap current and next digit
                decrypted.append(encrypted.charAt(i + 1));
                decrypted.append(encrypted.charAt(i));
                i += 2;
            } else {
                // Last digit, no pair to swap with
                decrypted.append(encrypted.charAt(i));
                i++;
            }
        }

        System.out.println(decrypted.toString());
    }
}

Input:1234567
output:2143657


