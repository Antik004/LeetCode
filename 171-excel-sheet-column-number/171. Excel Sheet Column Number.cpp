class Solution {
public:
    int titleToNumber(string columnTitle) {
        long long finalans=0;

        for(char c:columnTitle)
        {
            finalans=finalans*26+(c-'A'+1);
        }
        return finalans;
    }
};