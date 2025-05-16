import java.util.Scanner;
import java.util.Arrays;

public class MoveZeros {

    // Function to move all zeros to the end
    public static void moveZerosToEnd(int[] arr) {
        int index = 0; // Index to place non-zero elements

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Fill remaining positions with 0
        while (index < arr.length) {
            arr[index++] = 0;
        }

        // Print result
        System.out.println("Array after moving zeros: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZerosToEnd(arr);

        sc.close();
    }
}


Enter size of array: 7
Enter array elements:
0 1 0 3 12 0 5
Array after moving zeros: [1, 3, 12, 5, 0, 0, 0]

