class NumArray {
    int arrA[];
    public NumArray(int[] nums) {
        arrA=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            arrA[i+1]=arrA[i]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return arrA[right+1]-arrA[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */