//n is odd print weird and n is even and inclusive range 2 to 5 print not weird and
//n is even the inclusive range 6 to 20 print weird and grater than 20 print not weird 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        }

        scanner.close();
    }
}

output:
input 3
weird
