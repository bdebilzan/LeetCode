/*
We have a collection of rocks, each rock has a positive integer weight.

Each turn, we choose the two heaviest rocks and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)


Example 1:

Input: [2,7,4,1,8,1]
Output: 1
Explanation: 
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.

Link: https://leetcode.com/problems/last-stone-weight/
*/


class Solution {
    public int lastStoneWeight(int[] stones) 
    {        
        List <Integer> result = new ArrayList<Integer>();
        
        Arrays.sort(stones);
        
        for(int i = 0; i < stones.length; i++)
        {
             result.add(stones[i]);
        }
          
        while(result.size() > 1)
        {
            int x = 0;
            int y = 0;
        
            int length = result.size();
        
            y = result.get(length - 1);
            x = result.get(length - 2);
            
            if(x == y)
            {
                //remove both x and y
                result.remove(Integer.valueOf(x));
                result.remove(Integer.valueOf(y));
            }
            else
            {
                //remove x and y = y - x
                result.remove(Integer.valueOf(x));
                result.remove(Integer.valueOf(y));
                y = y - x;
                result.add(y);
                
                //need to sort
                Collections.sort(result);
            }
        }
        
        int resultInt = 0;
        
        if(result.size() > 0)
        {
            resultInt = result.get(0);
        }
        
         return resultInt;
    }
}
