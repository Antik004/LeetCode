class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        int n=nums.size();

        vector<bool> present(n+1,false);

        for(int i:nums)
        {
            present[i]=true;
        }

        vector<int> res;

        for(int j=1;j<=n;j++)
        {
            if(!present[j])res.push_back(j);
        }
        return res;
    }
};