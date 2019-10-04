/*
Given words first and second, consider occurrences in some text of the form "first second third", 
where second comes immediately after first, and third comes immediately after second.
For each such occurrence, add "third" to the answer, and return the answer.

Example 1:

Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
Output: ["girl","student"]

Example 2:

Input: text = "we will we will rock you", first = "we", second = "will"
Output: ["we","rock"]

Link: https://leetcode.com/problems/occurrences-after-bigram
*/

class Solution {
    public String[] findOcurrences(String text, String first, String second) 
    {
        List<String> resultList = new ArrayList<>();
        
        String[] textArray = text.split(" ");
        
        for(int i = 0; i < textArray.length - 2; i++)
        {
            if(textArray[i].equals(first) && textArray[i + 1].equals(second))
            {
                resultList.add(textArray[i + 2]);
            }
        }
                
        String[] resultArray = new String[resultList.size()];
        resultArray = resultList.toArray(resultArray);
        
        return resultArray;
    }
}
