* * * * * 
  * * * * 
    * * * 
      * * 
        * 
public class Main {
    public static void main(String[] args) {
        int n = 5; // Total number of rows

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line
        }
    }
}

