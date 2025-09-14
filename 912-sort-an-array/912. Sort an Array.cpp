class Solution {
public:
    int partition(vector<int>&nums,int start,int end)
    {
        int pivot=nums[end];
        int i=start-1;

        for(int j=start;j<=end-1;j++)
        {
            if(nums[j]<pivot)
            {
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        i++;
        int temp=nums[i];
        nums[i]=nums[end];
        nums[end]=temp;

        return i;
    }
    void quicksort(vector<int>&nums,int start,int end)
    {
        if(end<=start)
        {
            return;
        }
        int pi=start+rand()%(end-start+1);
        swap(nums[end],nums[pi]);
        int pivot=partition(nums,start,end);
        quicksort(nums,start,pivot-1);
        quicksort(nums,pivot+1,end);
    }
    vector<int> sortArray(vector<int>& nums) {
        int n=nums.size();

        quicksort(nums,0,n-1);
        return nums;
    }
};