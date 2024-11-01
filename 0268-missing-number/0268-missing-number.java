class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int i,j;
       
        for(i=0;i<l;i++)
        {
            boolean found=false;
            for(j=0;j<l;j++)
            {
                
                if(i==nums[j])
                {
                    found=true;
             

                }
            }
                if(!found)
                {
                    return i;
                }
        }
        return l;
    }
}