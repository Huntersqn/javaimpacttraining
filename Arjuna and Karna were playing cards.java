rjuna and Karna were playing cards. Arjuna has 5 cards. Karna wants to insert a new card in between Arjuna's cards. Karna wants to find the position to insert the card. So help him to find the position to insert a certain card. If Karna inserts a card in a position other than the position of 5 cards, the game will be over. So play carefully.

For example, consider an array having three elements in it initially and a[0] = 1, a[1] = 2 and a[2] = 3 and you want to insert a number 45 at location 1 i.e. a[0] = 45, so we have to move elements one step below after insertion a[1] = 1, and a[2] = 2 and a[3] = 3.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cards = new int[6]; // allow space for 1 extra card
        int size = 5;

        // Input 5 cards from Arjuna
        System.out.println("Enter 5 cards:");
        for (int i = 0; i < size; i++) {
            cards[i] = sc.nextInt();
        }

        // Input card to insert
        System.out.print("Enter the card to insert: ");
        int newCard = sc.nextInt();

        // Input position to insert (0 to 4)
        System.out.print("Enter the position (0 to 4): ");
        int pos = sc.nextInt();

        // Validate position
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position! Game Over.");
        } else {
            // Shift elements to the right
            for (int i = size; i > pos; i--) {
                cards[i] = cards[i - 1];
            }

            // Insert the new card
            cards[pos] = newCard;

            // Print the updated cards
            System.out.println("Cards after insertion:");
            for (int i = 0; i <= size; i++) {
                System.out.print(cards[i] + " ");
            }
        }

        sc.close();
    }
}

output:
Enter 5 cards:
1
12
3
4
5
Enter the card to insert: 9
Enter the position (0 to 4): 4
Cards after insertion:
1 12 3 4 9 5 
