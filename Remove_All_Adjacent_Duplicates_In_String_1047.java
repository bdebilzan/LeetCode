/*
Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
We repeatedly make duplicate removals on S until we no longer can.
Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.

Example 1:

Input: "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  
The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

Link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string
*/

class Solution {
    public String removeDuplicates(String S) 
    {        
        int i = 0;
        
        while(i < S.length() - 1)
        {            
            if(S.charAt(i) == S.charAt(i+1))
            {
                S = new StringBuilder(S).deleteCharAt(i).deleteCharAt(i).toString();
                i = 0;
            }
            else
            {
                i++;
            }
        }
    
        return S;
    }
}
