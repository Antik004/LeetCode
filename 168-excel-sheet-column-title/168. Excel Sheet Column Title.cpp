class Solution {
public:
    string convertToTitle(int columnNumber) {
        string colname;
        while(columnNumber>0)
        {
            columnNumber--;
            char c='A'+(columnNumber%26);
            colname=c+colname;
            columnNumber=columnNumber/26;
        }
        return colname;
    }
};