/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4

Link: https://leetcode.com/problems/single-number
*/

class Solution {
    public int singleNumber(int[] nums) 
    {  
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int num: nums)
        {
            if(map.containsKey(num))
            {
                map.put(num, 1);
            }
            else
            {
                map.put(num, 2);
            }
        }
        
        for(Integer key:map.keySet())
        {
            if(map.get(key) == 2)
            {
                return key;
            }
        }
        
        return 0;     
    }       
}
