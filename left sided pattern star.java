        *
        * * 
        * * * 
        * * * * 
        * * * * * 

public class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print (n - 1) spaces (or pattern — your original idea wasn't clear)
            for (int j = 1; j <= (n - 1); j++) {
                System.out.print("  "); // Changed * * to spaces
            }
            // Print i stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


output:
        *
        * * 
        * * * 
        * * * * 
        * * * * * 


