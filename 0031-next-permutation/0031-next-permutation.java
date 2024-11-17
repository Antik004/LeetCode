class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int c = 0;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            for (int i = nums.length - 1; i > c; i--, c++) {
                int temp = nums[i];
                nums[i] = nums[c];
                nums[c] = temp;
            }
            return;
        }

        for (int i = nums.length - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        for (int i = index + 1, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
