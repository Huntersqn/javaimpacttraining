//Nikitha and Danny are close friends. They both are studying in the same school. Now they are on summer vacation.
//As they are bored, they ask their parents to take them to an exhibition. Nikitha and Danny play a game.
//In this game, there are three boxes with some number written on top. There is a treasure in one of the three boxes and 
//it is present in the box with the second largest number on top. Also, to open the box, they need to decode the correct code of this box. 
//The clue given to them to find the code is that it is the largest number that divides all three given numbers. So, now help Nikitha and Danny to decode the code.
//Input Format
//Input consists of three integers. The first input corresponds to the number of the first box.
//The second input corresponds to the number of the second box. The third input corresponds to the number of the third box.

import java.util.*;
public class TreasureBoxGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read 3 integers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Find second largest
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        int secondLargest = arr[1];

        // Find GCD of all three numbers
        int gcd = gcd(gcd(a, b), c);

        // Output
        System.out.println("The treasure is in the box with number: " + secondLargest);
        System.out.println("The code to open the box is: " + gcd);
    }

    // GCD function using recursion
    static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}


output:
Enter three integers: 12 15 20
The treasure is in the box with number: 15
The code to open the box is: 1
