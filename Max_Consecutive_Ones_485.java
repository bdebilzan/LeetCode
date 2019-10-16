/*
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:

Input: [1,1,0,1,1,1]

Output: 3

Explanation: The first two digits or the last three digits are consecutive 1s.
The maximum number of consecutive 1s is 3.
    
Link: https://leetcode.com/problems/max-consecutive-ones
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {  

        int temp = 0;
        int max = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                temp++;
                
                if(temp > max)
                {
                    max = temp;
                }
            }
            else
            {
                temp = 0;
            }
        }
        
        return max;
    }
}
