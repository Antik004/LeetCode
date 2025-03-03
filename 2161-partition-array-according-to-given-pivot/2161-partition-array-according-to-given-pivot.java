class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int lessCount = 0, equalCount = 0;

        // Step 1: Count elements < pivot and == pivot
        for (int num : nums) {
            if (num < pivot) lessCount++;
            else if (num == pivot) equalCount++;
        }

        // Step 2: Rearrange elements in-place
        int i = 0, j = lessCount, k = lessCount + equalCount;

        int[] temp = new int[n]; // Temporary array for stable order
        for (int num : nums) {
            if (num < pivot) temp[i++] = num;
            else if (num == pivot) temp[j++] = num;
            else temp[k++] = num;
        }

        // Step 3: Copy back to original array
        System.arraycopy(temp, 0, nums, 0, n);
        return nums;
    }
}