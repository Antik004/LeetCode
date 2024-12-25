class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // A set to maintain a window of at most k elements
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If the current number already exists in the window, we found a duplicate
            if (window.contains(nums[i])) {
                return true;
            }

            // Add the current number to the window
            window.add(nums[i]);

            // Maintain the size of the window to at most k
            if (window.size() > k) {
                window.remove(nums[i - k]); // Remove the oldest element from the window
            }
        }

        return false;
    }
}
