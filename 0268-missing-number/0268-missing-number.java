class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int i=0;
        int sum=0;
        while(i<l)
        {
           
            sum=sum^i^nums[i];
            i++;
        }
        sum=sum^l;
        return sum;
    }
}