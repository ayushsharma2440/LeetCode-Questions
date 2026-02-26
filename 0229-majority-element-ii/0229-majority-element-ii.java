class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashMap<Integer,Integer> dict = new HashMap<>();
        for (int i:nums){
            dict.put(i,dict.getOrDefault(i,0)+1);     
        } 
        for (int i:nums){
            if(dict.get(i)>(nums.length/3)){
                if (ans.contains(i)==false){
                    ans.add(i);
                }
            }      
        }
        return ans;
    }
}