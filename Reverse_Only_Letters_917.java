/*
Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.

Example 1:

Input: "ab-cd"
Output: "dc-ba"

Example 2:

Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"

Example 3:

Input: "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"

Link: https://leetcode.com/problems/reverse-only-letters
*/

class Solution {
    public String reverseOnlyLetters(String S) 
    {
        char [] result = new char[S.length()];
        
        int count = 0;

        for(int i = 0; i < S.length(); i++)
        {            
            if(!Character.isLetter(S.charAt(i)))
            {
 		    result[i] = S.charAt(i);
            }
            else
            {
                char temp2 = S.charAt(S.length() - 1 - count++);
                
                if(Character.isLetter(temp2))
                {
                    result[i] = temp2; 
                }
                else
                {
                    i--;
                }  
            }
        }

        return new String (result);
    }
}
