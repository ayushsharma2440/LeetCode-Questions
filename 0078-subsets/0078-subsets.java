class Solution {
    void subset(int array[],ArrayList<Integer> list,int i, List<List<Integer>> ans ){
        int n = array.length;
        if (i>=n){
        ans.add(new ArrayList<>(list));
        return;
        }
        list.add(array[i]);
        subset(array, list, i+1,ans);  
        list.remove(list.size()-1);
        subset(array, list, i+1,ans); 

    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        subset(nums, list, 0,ans);
        return ans;
    }
}