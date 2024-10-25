class Solution {
    public int maxArea(int height[]) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        int area=0;
        while(left<right){
            area=Math.min(height[left],height[right])*(right-left);
        if(area>maxarea)
           maxarea=area;
        if(height[left]<height[right])
            left++;
        else right--;
        }
        return maxarea;
    }
}