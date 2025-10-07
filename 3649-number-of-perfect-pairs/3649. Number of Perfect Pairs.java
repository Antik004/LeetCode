class Solution {
    public long perfectPairs(int[] nums) {
       int n=nums.length;
        int a[]=new int[n];

        for(int i=0;i<n;i++)
            a[i]=Math.abs(nums[i]);
        Arrays.sort(a);

        long ans=0;
        int l=0;

        for(int r=0;r<n;r++)
            {
                while(l<r&&(long)a[l]*2<a[r])
                    l++;
                ans+=r-l;
            }
        return ans;

         
    }
}