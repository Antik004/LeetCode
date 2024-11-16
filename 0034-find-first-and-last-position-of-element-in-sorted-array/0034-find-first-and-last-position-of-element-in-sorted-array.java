import java.util.*;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] resarr = {-1, -1};
        boolean flag = false;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && !flag) {
                resarr[0] = i;
                flag = true;
            }
            if (nums[i] == target) {
                resarr[1] = i;
            }
        }
        
        return resarr;
    }
}
