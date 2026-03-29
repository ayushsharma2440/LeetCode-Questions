class Solution {
    public boolean canFinish(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[]edge:edges){
            adj.get(edge[1]).add(edge[0]);
        }
        boolean vis[] = new boolean[V];
        int degree[] = new int[V];
        for (int i=0;i<V;i++){
            for(int x:adj.get(i)){
                degree[x]=degree[x]+1;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i=0;i<V;i++){
            if (degree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);
            for (int x:adj.get(node)){
                degree[x]--;
                if (degree[x]==0){
                    q.add(x);
                }
            }
        }
        return ans.size()==V;
    }
}