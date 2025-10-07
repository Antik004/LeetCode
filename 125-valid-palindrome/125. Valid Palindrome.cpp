class Solution {
public:
    bool isPalindrome(string s) {
       int l = s.length();
       string str;
       str.reserve(l);
       string pal;
       pal.reserve(l);
       for (int i = 0; i < l; i++) {
            char c = s[i];
            if ((65 <= (int)c && (int)c <= 90) || (97 <= (int)c && (int)c <= 122)|| (48 <= (int)c && (int)c <= 57)
) {
                if (65 <= (int)c && (int)c <= 90) {
                    c = c + 32;
                }
                str.push_back(c);
            }
       }
       int k = str.length();
       for (int j = k - 1; j >= 0; j--) {
           pal.push_back(str[j]);
       }
       return pal == str;
    }
};
