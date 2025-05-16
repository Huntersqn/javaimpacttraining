Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays. The overall run time complexity should be O(log (m+n))

import java.util.Arrays;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;          // Last element in nums1's actual data
        int j = n - 1;          // Last element in nums2
        int k = m + n - 1;      // Last position in nums1 (total length)

        // Fill nums1 from the end
        while (i >= 0 && j >= 0) {
            nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }

        // If anything left in nums2, copy it
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        int m = 3, n = 3;

        new MergeSortedArrays().merge(nums1, m, nums2, n);
        System.out.println("Merged: " + Arrays.toString(nums1));
    }
}

output:
Merged: [1, 2, 3, 4, 5, 6]