class Solution {
    public void moveZeroes(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[x]=nums[i];
                x++;
            }
    
        }
        while(x<nums.length)
        {
            nums[x]=0;
            x++;
        }
    }
}