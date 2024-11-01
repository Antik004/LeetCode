class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int trueSum=l*(l+1)/2;
        int actSum=0;
        for(int i=0;i<l;i++)
        {
            actSum=actSum+nums[i];
        }
        return (trueSum-actSum);
    }
}