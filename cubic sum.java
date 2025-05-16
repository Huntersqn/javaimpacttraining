 cubic sum

import java.util.*;

public class CubicSum {

    public static int isCubicSumExist(long[] A, int N) {
        Set<Long> cubeSums = new HashSet<>();

        // Precompute all x^3 + y^3 for a reasonable range of x, y
        for (int x = -1000; x <= 1000; x++) {
            for (int y = -1000; y <= 1000; y++) {
                long sum = (long) x * x * x + (long) y * y * y;
                cubeSums.add(sum);
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (cubeSums.contains(A[i])) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        long[] arr = {9, 35, 91, 1729, 100};
        int result = isCubicSumExist(arr, arr.length);
        System.out.println("Count of good integers: " + result);
    }
}

output:
Count of good integers: 4