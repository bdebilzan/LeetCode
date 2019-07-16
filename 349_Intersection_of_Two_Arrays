/*
Given two arrays, write a function to compute their intersection.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:

Each element in the result must be unique.
The result can be in any order.
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        List list = new ArrayList<Integer>();
        
          for(int i = 0; i < nums1.length; i++)
          {
              for(int j = 0; j < nums2.length; j++)
              {
                  if(nums1[i] == nums2[j])
                  {
                      if (!(list.contains(nums1[i])))
                      {
                        list.add(nums1[i]);
                      }
                  }
              }
          }
        
        int[] result = new int[list.size()];     
        Iterator<Integer> iter = list.iterator();
        
        for (int i = 0; iter.hasNext(); i++) 
        {       
            result[i] = iter.next();                
        } 
        
        return result;
    }
}
