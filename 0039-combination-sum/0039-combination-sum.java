class Solution {
    void subsequence(int[] candidates, int target,List<List<Integer>> ans,List<Integer> ds,int i){
        int n = candidates.length;
        if (i>=n){
            if (target==0)
            ans.add(new ArrayList<>(ds));
            return;
        }
        if (candidates[i]<=target){
        ds.add(candidates[i]);
        subsequence(candidates,target-candidates[i],ans,ds,i);
        ds.remove(ds.size()-1);
        }
        
        subsequence(candidates,target,ans,ds,i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        subsequence(candidates,target,ans,ds,0);
        return ans;
        
    }
}