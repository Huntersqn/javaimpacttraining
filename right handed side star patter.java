
* * * * * 
  * * * * 
    * * * 
      * * 
        * 


public class Main {
    public static void main(String[] args) {
        int n = 5; // Total number of rows

        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  "); // Two spaces for alignment
            }

            // Print stars
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}
