class Solution {
    public int missingNumber(int[] nums) {
        
        int trueSum=nums.length*(nums.length+1)/2;
        int actSum=0;
        int i=0;
        while(i<nums.length)
        {
            actSum=actSum+nums[i];
            i++;
        }
        return (trueSum-actSum);
    }
}