n=10,m=50 are the range and it is divisible by 7&9 are


public class DivisibleBy7And9 {
    public static void main(String[] args) {
        int n = 10;
        int m = 50;
        int lcm = lcm(7, 9);
        boolean found = false;

        System.out.println("Numbers divisible by both 7 and 9 between " + n + " and " + m + ":");

        for (int i = n; i <= m; i++) {
            if (i % lcm == 0) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("None found in this range.");
        }
    }

    // Helper method to calculate LCM using GCD
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    // Helper method to calculate GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


output:
Numbers divisible by both 7 and 9 between 10 and 50:
63
None found in this range.
