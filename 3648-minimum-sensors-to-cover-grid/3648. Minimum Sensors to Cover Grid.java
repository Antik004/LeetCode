class Solution {
    public int minSensors(int n, int m, int k) {
        int b=2*k+1;
        int r=(n+b-1)/b;
        int c=(m+b-1)/b;
        return r*c;


    }
}