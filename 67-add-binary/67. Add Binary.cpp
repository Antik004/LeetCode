class Solution {
public:
    string addBinary(string a, string b) {
        string res = "";
        int i = a.size() - 1;
        int j = b.size() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry) {
            int bitA = (i >= 0 ? a[i] - '0' : 0);
            int bitB = (j >= 0 ? b[j] - '0' : 0);
            int sum = bitA ^ bitB ^ carry;

            carry = (bitA & bitB) | (bitB & carry) | (bitA & carry);

            res.push_back(sum + '0');
            i--, j--;
        }

        reverse(res.begin(), res.end());
        return res;
    }
};
