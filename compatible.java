Two arrays are said to be compatible if they are of the same size and if the ith element in the first array is greater than or equal to the ith element in the second array for all the values of i. Write a program to find whether 2 arrays are compatible or not.

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 7, 8};
        int[] arr2 = {2, 6, 5, 8};

        if (areArraysCompatible(arr1, arr2)) {
            System.out.println("Arrays are compatible.");
        } else {
            System.out.println("Arrays are not compatible.");
        }
    }

    static boolean areArraysCompatible(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < b[i]) {
                return false;
            }
        }

        return true;
    }
}

output:
they are compatible
