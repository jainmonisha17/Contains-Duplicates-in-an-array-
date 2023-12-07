// Name: Monisha Jain G.N
// Higher Qualification: MCA (Master of Computer Applications)
// College: PES Banglore

import java.util.*;

public class DuplicatesBruteForce {
    public boolean containsDuplicate(int[] nums) { 
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
    DuplicatesBruteForce solution = new DuplicatesBruteForce();

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

// Time Complexity The algorithm takes  where  is the number of elements in the input array. This is because we need to compare each element with all other elements, which takes  time.

// Space Complexity The algorithm takes, because we only need a few variables to store the indices, which takes constant space.


    

