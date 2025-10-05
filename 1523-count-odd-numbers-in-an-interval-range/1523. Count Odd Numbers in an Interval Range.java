class Solution {
    public int countOdds(int low, int high) {
        int s=0;
        if((low%2)==0 && (high%2)==0)
        {
            return ((high-low)/2); 
        }
        else 
        {
            return ((high-low)/2)+1;
        }
        
    }
}