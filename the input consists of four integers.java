the input consists of four integers the first input corresponds  to the size of an array the second input corresponds to the array elements. The third input corresponds to the location where you wish to insert an element the fourth input corresponds to the elements to be inserting 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read array size
        int size = sc.nextInt();

        // 2. Read array elements
        int[] arr = new int[size + 1]; // extra space for insertion
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. Read position to insert
        int pos = sc.nextInt();

        // 4. Read element to insert
        int newElement = sc.nextInt();

        // Validate position
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position!");
        } else {
            // Shift elements to the right
            for (int i = size; i > pos; i--) {
                arr[i] = arr[i - 1];
            }

            // Insert new element
            arr[pos] = newElement;

            // Print updated array
            for (int i = 0; i <= size; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}

Input:
5
10 20 30 40 50
2
99
output:
10 20 99 30 40 50 

