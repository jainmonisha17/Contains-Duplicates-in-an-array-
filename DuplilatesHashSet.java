// Name: Monisha Jain G.N
// Higher Qualification: MCA (Master of Computer Applications)
// College: PES Banglore/

/ HashSet Approach:

import java.util.*;

public class DuplilatesHashSet {

  

  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> mySet = new HashSet<>();
    // using hashset to store unique elements
    
    for(int i = 0; i < nums.length; i++) {
        if(!mySet.add(nums[i])) {
            return true;
        }
    }
    return false;
}


  public static void main(String[] args) {
    DuplilatesHashSet solution = new DuplilatesHashSet();

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

// TC -> O(N), N is the no of elements in the input array because we are iterating the array only once.
// SC -> O(N), as it stores the elements in HashSet.