import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
            int x=nums[i];
            int j=0;
            while(j <nums.length)
            {
                if(i!=j && nums[j]==x && Math.abs(i-j)<=k)
                {
                    return true;
                }
                j++;
                
            }
        }
        return false;
    }
}