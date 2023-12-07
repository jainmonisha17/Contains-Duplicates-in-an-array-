// Name: Monisha Jain G.N
// Higher Qualification: MCA (Master of Computer Applications)
// College: PES Banglore


// Sorting: We will sort the array and then iterate through it, comparing each element with the next one.
// If any two elements are same, we will return true. It we have gone
// through the entire array and haven't found any duplicates means no duplicates so return false.

import java.util.*;

public class DuplilatesSort {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
    DuplilatesSort solution = new DuplilatesSort();

    int[] nums1 = {1, 2, 3, 4};
    System.out.println(solution.containsDuplicate(nums1)); // Expected output: false

    int[] nums2 = {1, 2, 3, 1};
    System.out.println(solution.containsDuplicate(nums2)); // Expected output: true

    int[] nums3 = {};
    System.out.println(solution.containsDuplicate(nums3)); // Expected output: false

    int[] nums4 = {1, 1, 1, 1};
    System.out.println(solution.containsDuplicate(nums4)); // Expected output: true
  }
}

// TC -> O(n * logN), N is the no of elements in the array nums.
// sorting takes

// SC -> O(1) or O(n) depending on the sorting algorithm used.


