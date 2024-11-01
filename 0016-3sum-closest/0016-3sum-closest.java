import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int i=0;
        Arrays.sort(nums);
        int solution=nums[0]+nums[1]+nums[2];
        for(i=0;i<nums.length-2;i++)
        {
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
               int currSolution=nums[i]+nums[left]+nums[right];
               if(currSolution==target)
               {
                return currSolution;
               }
                if(Math.abs(currSolution-target)<Math.abs(solution-target))
               {
                solution=currSolution;
               }
                if(currSolution<target)
               {
                left++;
               }else 
               {
                right--;
               }
            }
        }

        return solution;
    }
    
}