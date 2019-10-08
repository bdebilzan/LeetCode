/*
A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.
We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

The rules of Goat Latin are as follows:

If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
For example, the word 'apple' becomes 'applema'.
 
If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".
 
Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
Return the final sentence representing the conversion from S to Goat Latin. 

Example 1:

Input: "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"

Example 2:

Input: "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"

Link: https://leetcode.com/problems/goat-latin
*/

class Solution {
    public String toGoatLatin(String S) {    
        
        List<String> myList = new ArrayList<String>(Arrays.asList(S.split(" ")));
        
        String endOfWord = "a";
        
        for(int i = 0; i < myList.size(); i++)
        {
            char lowercaseC = Character.toLowerCase(myList.get(i).charAt(0));
                
            if(lowercaseC == 'a' || lowercaseC == 'e' || lowercaseC == 'i' || lowercaseC == 'o' || lowercaseC == 'u')
            {
                myList.set(i, myList.get(i) + "ma" + endOfWord);
            }
            else 
            {
                myList.set(i, myList.get(i).substring(1) + myList.get(i).substring(0, 1) + "ma" + endOfWord);
            }
            
            endOfWord += "a";
        }

        return String.join(" ", myList);
    }
}
