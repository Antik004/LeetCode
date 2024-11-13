class Solution {
    public boolean canSortArray(int[] nums) {
        int l = nums.length;
   
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - 1 - i; j++) {
                int bits = countSetBits(nums[j]);
                int bitsj = countSetBits(nums[j + 1]);
                if (bits==bitsj && nums[j] > nums[j + 1]) {
                   
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        
      
        for (int i = 0; i < l - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

   
    public int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 1) {
                count++;
            }
            num = num / 2;
        }
        return count;
    }
}
