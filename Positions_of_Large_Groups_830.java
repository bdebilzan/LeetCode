/*
In a string S of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".

Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.

The final answer should be in lexicographic order.

Link: https://leetcode.com/problems/positions-of-large-groups
*/

class Solution {
    public List<List<Integer>> largeGroupPositions(String S) 
    {
        List<List<Integer>> result = new ArrayList<>();
        
        int num1 = 0;
        int num2 = 0;
        
        if(S.length() < 3)
        {
            return result;
        }
        
        for(int i = 0; i < S.length() - 2; i++)
        {
            if(S.charAt(i) == S.charAt(i + 1) && S.charAt(i) == S.charAt(i + 2))
            {                
                num1 = i;
                i += 2;
                
                for(int j = i; j < S.length() - 1; j++)
                {
                    if(S.charAt(j + 1) != S.charAt(j))
                    {
                        break;
                    }
                    else
                    {
                        num2++;
                    }
                }
                
                num2 = 2 + num2 + num1;
                
                result.add(new ArrayList<Integer>(Arrays.asList(num1, num2))); 
                
                i = num2;
                num2 = 0;
            }
        }
        
        return result;
    }
}
