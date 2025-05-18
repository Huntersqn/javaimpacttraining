leetcode169:Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

public class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        // Check each element's count
        for (int i = 0; i < n; i++) {
            int count = 0;

            // Count how many times nums[i] appears
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }

            // If count is more than n/2, return that element
            if (count > n / 2) {
                return nums[i];
            }
        }

        return -1; // This line won't be reached because a majority element always exists
    }
}

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 