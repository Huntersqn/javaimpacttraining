//Having crossed the three-headed dog, Harry, Ron, and Hermoine went through a secret trap door in search of Sorcerer's stone. 
//On the way, they passed through a room and found that the room has only one door opposite to them and
//the door through which they entered has shut once they entered the room. 
//The door was very large with a four digit number imprinted on it. When Harry and Ron tried to open it by casting out spells, it didn't open.
//Having tried various spells both of them got fed up and they left the task to Hermoine. 
//Hermoine on curiously observing the room found that a statement was written on the top of the room. 
//It was written as follows "I will be always four" “I can only be opened when you add my first and last and enter it” “If you find a sign, 
//you should not consider it” Help Hermoine break the code and open the door so that they can save the sorcerer's stone.


import java.util.Scanner;

public class SorcerersStone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number on the door: ");
        String doorNumber = scanner.nextLine();

        // Validate that it is a 4-digit number
        if (doorNumber.length() != 4 || !doorNumber.matches("\\d{4}")) {
            System.out.println("Invalid door number. It should be a 4-digit number.");
            return;
        }

        // Extract first and last digits
        int firstDigit = Character.getNumericValue(doorNumber.charAt(0));
        int lastDigit = Character.getNumericValue(doorNumber.charAt(3));

        int sum = firstDigit + lastDigit;

        System.out.println("The code to open the door is: " + sum);
    }
}


output:
Enter the 4-digit number on the door: 3527
The code to unlock the door is: 10

