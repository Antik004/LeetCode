class Solution {
public:
    bool canJump(vector<int>& nums) {
        int arrSize=nums.size();
        if(arrSize==1)
        {
            return true;
        }
        int farthest = 0;
        for (int i = 0; i <= farthest; i++) {
            farthest = max(farthest, i + nums[i]);
            if (farthest >=arrSize - 1) 
                return true;
        }
        return false;
    }
};