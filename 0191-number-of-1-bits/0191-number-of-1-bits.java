import java.util.*;
class Solution {
    public int hammingWeight(int n) {
        String x = Integer.toBinaryString(n);
        int set = 0;

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '1') {
                set++;
            }
        }

        return set;
    }
}