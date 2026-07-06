class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        int c = 0;

        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0])
            {
                return Integer.compare(b[1],a[1]);
            }
            return Integer.compare(a[0],b[0]);
        });

        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals.length; j++) {

                if (i == j)
                    continue;

                if (intervals[j][0] <= intervals[i][0] &&
                    intervals[i][1] <= intervals[j][1]) {

                    c++;
                    break;
                }
            }
        }

        return intervals.length - c;
    }
}