class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // Initialize the distance matrix with infinity
        int INF = Integer.MAX_VALUE;
        int[][] dist = new int[n][n];
        
        // Set the initial distances to infinity
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    dist[i][j] = INF;
                }
            }
        }
        
        // Fill the distance matrix with the given edges
        for (int[] time : times) {
            int u = time[0] - 1; // Convert to 0-based indexing
            int v = time[1] - 1; // Convert to 0-based indexing
            int w = time[2];
            dist[u][v] = w;
        }
        
        // Floyd-Warshall algorithm
        for (int kIndex = 0; kIndex < n; kIndex++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][kIndex] != INF && dist[kIndex][j] != INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][kIndex] + dist[kIndex][j]);
                    }
                }
            }
        }

        // Find the maximum distance from node k-1 to all other nodes
        int maxDist = 0;
        for (int i = 0; i < n; i++) {
            if (dist[k - 1][i] == INF) {
                return -1; // If any node is unreachable, return -1
            }
            maxDist = Math.max(maxDist, dist[k - 1][i]);
        }

        return maxDist;
    }
}