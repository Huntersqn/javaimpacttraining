You are playing an online game. In the game, a list of N numbers is given. The player has to arrange the numbers so that all the odd numbers on the list come after the even numbers. Write an algorithm to arrange the given list such that all the odd numbers of the list come after the even numbers.
Input Format
The first line of the input consists of an integer num, representing the size of the list(N). The second line of the input consists of N space-separated integers representing the values of the list.
Output Format
Print N space-separated integers such that all the odd numbers of the list comes after the even numbers

import java.util.*;

public class EvenOddRearrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of the list: ");
        int num = sc.nextInt();

        // Input list
        int[] arr = new int[num];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // Create two lists to hold evens and odds
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        // Separate even and odd numbers
        for (int val : arr) {
            if (val % 2 == 0) {
                evens.add(val);
            } else {
                odds.add(val);
            }
        }

        // Output even numbers followed by odd numbers
        for (int val : evens) {
            System.out.print(val + " ");
        }
        for (int val : odds) {
            System.out.print(val + " ");
        }
    }
}

input:
Enter size of the list: 6
Enter the numbers:
10 3 5 8 2 7
output:
10 8 2 3 5 7

