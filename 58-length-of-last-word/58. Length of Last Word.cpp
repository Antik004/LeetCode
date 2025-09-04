class Solution {
public:
    int lengthOfLastWord(string s) {
        int l=s.length();
        if(l==0)return 0;
        int c=0;
        for(int i=l-1;i>=0;i--)
        {
            if(s[i]!=' ')
            {
                c++;
            }
            else if(c > 0)
            {
                return c;
            }
        }
        return c;
    }
};