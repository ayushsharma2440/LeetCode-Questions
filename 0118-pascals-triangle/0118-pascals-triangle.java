class Solution {
    ArrayList<Integer> find(int row){
        ArrayList<Integer> sub = new ArrayList<>();
        sub.add(1);
        int ans = 1;
        for (int i=1;i<row;i++){
            ans = ans * (row-i);
            ans = ans / i;
            sub.add(ans);
        }
        return sub;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=1;i<=numRows;i++){
            ans.add(find(i));
        }
        return ans;
    }
}