class Solution {
    private int cnt = 0;

    void dfs(int[][] isConnected, boolean[] vis, int node) {
        vis[node] = true;

        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[node][j] == 1 && !vis[j]) {
                dfs(isConnected, vis, j);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                cnt++;
                dfs(isConnected, vis, i);
            }
        }

        return cnt;
    }
}