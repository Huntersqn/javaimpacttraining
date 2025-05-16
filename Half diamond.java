
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

public class Main {
    public static void main(String[] args) {
        int n = 5; // Total number of rows for the upper half

        // Upper half (increasing stars)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half (decreasing stars)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
