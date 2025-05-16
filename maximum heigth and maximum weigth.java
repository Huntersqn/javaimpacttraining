import java.util.Scanner;

public class MaxHeightWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of persons: ");
        int n = sc.nextInt();

        int[] array = new int[n * 2]; // Each person has height and weight
        int max_h = 0, max_w = 0;
        int max_h_i = 0, max_w_i = 1;

        System.out.println("Enter height and weight for each person:");

        for (int i = 0; i < n * 2; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0) { // even index = height
                if (array[i] > max_h) {
                    max_h = array[i];
                    max_h_i = i;
                }
            } else { // odd index = weight
                if (array[i] > max_w) {
                    max_w = array[i];
                    max_w_i = i;
                }
            }
        }

        System.out.println("Maximum height: " + max_h);
        System.out.println("Maximum weight: " + max_w);
        System.out.println("Person with maximum height: " + ((max_h_i / 2) + 1));
        System.out.println("Person with maximum weight: " + ((max_w_i / 2) + 1));
    }
}


output:
Number of persons: 3
Enter height and weight for each person:
160 55
170 40
180 45
Maximum height: 180
Maximum weight: 55
Person with maximum height: 3
Person with maximum weight: 1

