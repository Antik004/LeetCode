class Solution {
    public int findShortestSubArray(int[] nums) {
        int maxVal = 0; // To determine the range of numbers
        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        
        int[] count = new int[maxVal + 1];
        int[] firstIndex = new int[maxVal + 1];
        int[] lastIndex = new int[maxVal + 1];
        
        for (int i = 0; i < firstIndex.length; i++) {
            firstIndex[i] = -1; // Initialize firstIndex array with -1
        }

        int degree = 0;
        
        // Fill in the arrays
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            count[num]++;
            if (firstIndex[num] == -1) {
                firstIndex[num] = i;
            }
            lastIndex[num] = i;
            degree = Math.max(degree, count[num]);
        }
        
        int minLength = nums.length;

        // Find the minimum length subarray with the same degree
        for (int i = 0; i <= maxVal; i++) {
            if (count[i] == degree) {
                minLength = Math.min(minLength, lastIndex[i] - firstIndex[i] + 1);
            }
        }
        
        return minLength;
    }

}
