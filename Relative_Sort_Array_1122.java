/*
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  
Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.

Example 1:

Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]

Link: https://leetcode.com/problems/relative-sort-array/
*/


class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        ArrayList<Integer> result = new ArrayList <Integer>();
        
        for(int i = 0; i < arr2.length; i++)
        {
            for(int j = 0; j < arr1.length; j++)
            {
                if(arr2[i] == arr1[j])
                {
                    result.add(arr1[j]);
                }
            }
        }
                
        ArrayList<Integer> temp = new ArrayList <Integer>();
        
        for(int i = 0; i < arr1.length; i++)
        {
            if (result.contains(arr1[i]))
            {
                continue;
            }
            else
            {
                temp.add(arr1[i]);
            }
        }
        
        Collections.sort(temp);
        
        for(int i = 0; i < temp.size(); i++)
        {
            result.add(temp.get(i));
        }
        
        int [] finalResult = new int [result.size()];
        
        for(int i = 0; i < result.size(); i++)
        {
            finalResult[i] = result.get(i);
        }
        
        return finalResult;
    }
}
