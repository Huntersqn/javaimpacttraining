 maximum height and minimum height with person number
import java.util.Scanner;

public class MaxMinHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of persons: ");
        int n = sc.nextInt();

        int[] array = new int[n * 2]; // Each person has height and weight
        int max_h = Integer.MIN_VALUE, min_h = Integer.MAX_VALUE;
        int max_h_i = 0, min_h_i = 0;

        System.out.println("Enter height and weight for each person:");

        for (int i = 0; i < n * 2; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < n * 2; i += 2) { // Only even indexes: heights
            if (array[i] > max_h) {
                max_h = array[i];
                max_h_i = i;
            }
            if (array[i] < min_h) {
                min_h = array[i];
                min_h_i = i;
            }
        }

        System.out.println("Maximum height: " + max_h);
        System.out.println("Person with maximum height: " + ((max_h_i / 2) + 1));
        System.out.println("Minimum height: " + min_h);
        System.out.println("Person with minimum height: " + ((min_h_i / 2) + 1));
    }
}

Number of persons: 3
Enter height and weight for each person:
160 55
170 65
150 50
output:
Maximum height: 170
Person with maximum height: 2
Minimum height: 150
Person with minimum height: 3
