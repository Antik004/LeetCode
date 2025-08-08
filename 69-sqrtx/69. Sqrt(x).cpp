class Solution {
public:
    int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        long long low = 0, high = x, mid, ans;

        while (low <= high) {
            mid = (low + high) / 2;
            long long square = mid * mid;

            if (square == x)
                return mid;
            else if (square < x) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
};
