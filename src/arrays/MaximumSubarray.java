package arrays;

/*Given an integer array nums, find the subarray
with the largest sum, and return its sum.

        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: The subarray [4,-1,2,1] has the largest sum 6.*/

public class MaximumSubarray {
        public int usingKadanesAlgo(int[] nums) {
            int max = nums[0], currentSum = nums[0];
            for(int i=1; i<nums.length; i++){
                currentSum = Math.max(currentSum + nums[i], nums[i]);
                max = Math.max(currentSum, max);
            }
            return max;
        }
    }
