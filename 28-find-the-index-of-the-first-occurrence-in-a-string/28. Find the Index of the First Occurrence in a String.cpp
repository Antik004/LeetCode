class Solution {
public:
    int strStr(string haystack, string needle) {
        int l1=haystack.length();
        int l2=needle.length();
        int p=0;
        if(l2==0)return 0;
        for(int i=0;i<l1;i++)
        {
            p=0;
            for(int j=0;j<l2;j++)
            {
                if(haystack[i+j]==needle[j])
                {
                    p++;
                }
                else
                    break; 
            }
            if(p==l2)
            {
                return i;
            }
        }
        return -1;
    }
};