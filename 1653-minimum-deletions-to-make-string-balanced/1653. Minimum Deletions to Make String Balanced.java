import java.util.*;
class Solution {
    public int minimumDeletions(String s) {
        int cb=0;
        int deletions=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='b')
            {
                cb++;
            }
            else{
                deletions=Math.min(deletions+1,cb);
            }
        }
        return deletions;
    }
}