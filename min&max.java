import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize min and max with first element
        int min = arr[0];
        int max = arr[0];

        // Traverse array to find min and max
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Output results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}

Enter number of elements: 4
Enter the elements:
7
9
1
2
Minimum value: 1
Maximum value: 9