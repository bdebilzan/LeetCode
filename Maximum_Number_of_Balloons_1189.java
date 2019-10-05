/*
Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
You can use each character in text at most once. Return the maximum number of instances that can be formed.

Example 1:

Input: text = "nlaebolko"
Output: 1

Example 2:

Input: text = "loonbalxballpoon"
Output: 2

Example 3:

Input: text = "leetcode"
Output: 0

Link: https://leetcode.com/problems/maximum-number-of-balloons
*/

class Solution {
    public int maxNumberOfBalloons(String text) 
    {   
        char [] chars = text.toCharArray();
        double [] result = new double[5];

        for(int i = 0; i < chars.length; i++)
        {
            if(chars[i] == 'b')
            {
                result[0] += 1;
            }
            else if(chars[i] == 'a')
            {
                result[1] += 1;
            }
            else if(chars[i] == 'l')
            {
                result[2] += .5;
            }
            else if(chars[i] == 'o')
            {
                result[3] += .5;
            }
            else if(chars[i] == 'n')
            {
                result[4] += 1;
            }
        }
         
        Arrays.sort(result);
        
        return (int)result[0];
    }
}
