/*

Students are asked to stand in non-decreasing order of heights for an annual photo.
Return the minimum number of students not standing in the right positions.  
(This is the number of students that must move in order for all students to be standing in non-decreasing order of height.)

Example 1:

Input: [1,1,4,2,1,3]
Output: 3
Explanation: 
Students with heights 4, 3 and the last 1 are not standing in the right positions.

Link: https://leetcode.com/problems/height-checker
*/

class Solution {
    public int heightChecker(int[] heights) 
    {
        int [] heightsCopy = new int [heights.length];
        
        int result = 0;
        
        for(int i = 0; i < heights.length; i++)
        {
            heightsCopy[i] = heights[i];
        }
        
        Arrays.sort(heights);
        
        for(int i = 0; i < heights.length; i++)
        {
            if(heightsCopy[i] != heights[i])
            {
                result++;
            }
        }
        
        return result;
    }
}
