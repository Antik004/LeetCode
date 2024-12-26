class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n]; // To store the index of the nearest smaller height to the left
        int[] right = new int[n]; // To store the index of the nearest smaller height to the right
        int maxArea = 0;

        // Fill left array
        for (int i = 0; i < n; i++) {
            int j = i - 1;
            while (j >= 0 && heights[j] >= heights[i]) {
                j = left[j]; // Go to the nearest smaller height to the left
            }
            left[i] = j;
        }

        // Fill right array
        for (int i = n - 1; i >= 0; i--) {
            int j = i + 1;
            while (j < n && heights[j] >= heights[i]) {
                j = right[j]; // Go to the nearest smaller height to the right
            }
            right[i] = j;
        }

        // Calculate the maximum area
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1; // Calculate width using left and right boundaries
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
