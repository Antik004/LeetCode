class Solution {
    public int majorityElement(int[] nums) {
        int l=nums.length;
        int count=0;
        int candidate=0;
        for(int i=0;i<l;i++)
        {
            if(count==0)
            {
                candidate=nums[i];
            }
            if(nums[i]==candidate)
            {
                count++;
            }
            else 
                count--;
        }
        return candidate;
    }
}