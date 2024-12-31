class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> arr=new ArrayList<>();
        int start;
        boolean flag=false;
        if(nums.length==0)
        {
            return arr;
        }
        else{
            start=nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            if(flag==false && nums[i]+1!=nums[i+1])
            {
                arr.add(String.valueOf(nums[i]));
                start=nums[i+1];
            }
            else if(nums[i]+1==nums[i+1]) 
            {
                flag=true;
            }
            else if(flag==true && nums[i]+1!=nums[i+1])
            {
                arr.add(String.valueOf(start)+"->"+nums[i]);
                flag=false;
                start=nums[i+1];
            }
        }
        }
         if (flag==false) {
            arr.add(String.valueOf(nums[nums.length - 1]));
        } else {
            arr.add(start + "->" + nums[nums.length - 1]);
        }
        return arr;
    }
}