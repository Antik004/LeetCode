class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        arr[0]=0;
        int k=1;
        while(k<=n)
        {
            arr[k]=arr[k/2]+(k%2);
            k++;
        }
        return arr;
    } 
}