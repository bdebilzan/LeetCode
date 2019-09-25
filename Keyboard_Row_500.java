/*
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard.

Example:

Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]

Link: https://leetcode.com/problems/keyboard-row
*/

class Solution {
    public String[] findWords(String[] words) 
    {
        List<String> result = new ArrayList<>();
        
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        
        boolean checkFirst = false;
        boolean checkSecond = false;
        boolean checkThird = false;
        
        for(int i = 0; i < words.length; i++)
        {
            if(words[i].length() == 1)
            {
                result.add(words[i]);
            }
                if(firstRow.contains(""+Character.toLowerCase(words[i].charAt(0))))
                {
                    checkFirst = true;
                }
                else if(secondRow.contains(""+Character.toLowerCase(words[i].charAt(0))))
                {
                    checkSecond = true;
                }
                else
                {
                    checkThird = true;
                }
                        
            for(int j = 1; j < words[i].length(); j++)
            {    
                if(checkFirst == true)
                {
                    if(firstRow.contains(""+Character.toLowerCase(words[i].charAt(j))))
                    {
                        if(j == words[i].length() - 1)
                        {
                            result.add(words[i]);
                        }
                    }
                    else
                    {
                        break;
                    }
                }
                else if(checkSecond == true)
                {
                    if(secondRow.contains(""+Character.toLowerCase(words[i].charAt(j))))
                    {
                        if(j == words[i].length() - 1)
                        {
                            result.add(words[i]);
                        }
                    }
                    else
                    {
                        break;
                    }
                }
                else if(checkThird == true)
                {
                    if(thirdRow.contains(""+Character.toLowerCase(words[i].charAt(j))))
                    {
                        if(j == words[i].length() - 1)
                        {
                            result.add(words[i]);
                        }
                    }
                    else
                    {
                        break;
                    }
                }
            }
                checkFirst = checkSecond = checkThird = false;   
        }
        
            String [] stringResult = result.toArray(new String[result.size()]);  
                        
            return stringResult;
    }
}
