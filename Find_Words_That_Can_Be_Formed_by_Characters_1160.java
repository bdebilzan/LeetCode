/*
You are given an array of strings words and a string chars.
A string is good if it can be formed by characters from chars (each character can only be used once).
Return the sum of lengths of all good strings in words.

Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: 
The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: 
The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.


Link: https://leetcode.com/problems/find-words-that-can-be-formed-by-characters
*/

class Solution {
    public int countCharacters(String[] words, String chars) 
    {
        int result = 0;
        String checker = chars;
        
        for(int i = 0; i < words.length; i++)
        {
            for(int j = 0; j < words[i].length(); j++)
            {   
                if(checker.contains("" + words[i].charAt(j)))
                {
                    checker = checker.replaceFirst("" + words[i].charAt(j), "");
                    
                    if(j == words[i].length() - 1)
                    {
                        result += words[i].length();
                    }
                }
                else
                {
                    break;
                }
            }
            checker = chars;
        }
        
        return result;
    }
}
