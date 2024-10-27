class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int l=nums.length;
        int i,j,k;
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(i=0;i<l-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            for(j=i+1;j<l-1;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1])
                {
                continue;
                 }
                for(k=j+1;k<l;k++)
                {
                    if(k>j+1 && nums[k]==nums[k-1])
                    {
                        continue;
                    }
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }

                }
            }
        }
        return res;
        
    }
}