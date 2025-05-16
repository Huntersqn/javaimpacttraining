* * * * 
*     * 
*     * 
* * * * 

public class Main {
    public static void main(String[] args) {
        int n = 4; // Rows
        int m = 4; // Columns

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // Print star if on the boundary
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Space for inner area
                }
            }
            System.out.println();
        }
    }
}
