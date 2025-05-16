//  three digit number in which middle is divisible 3

import java.util.Scanner;
public class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a 3 digit number: ");
        int number = sc.nextInt();
        
        int digit2 = (number / 10) % 10;
        
        if (digit2 % 3 == 0) {
            System.out.println("done");
        } else {
            System.out.println("notdone");
        }
    }
}



output:
input 365
done

