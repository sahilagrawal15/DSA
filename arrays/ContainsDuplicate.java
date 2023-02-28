package arrays;

/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

        Input: nums = [1,2,3,1]
        Output: true*/

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean firstWay(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
//Time Comp O(n)
//Space Comp O(n)
