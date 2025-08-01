class Solution {
    public int climbStairs(int n) {
        int c = 0;
        if (n == 0 || n == 1)
            return 1;
        int a = 1;//the ways i can use to reach step 0;i.e this is for 1st step
        int b = 1;//the ways i can use to reach step 1;this is for 2nd step
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}