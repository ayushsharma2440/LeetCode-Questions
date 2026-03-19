class Solution {
    public int[] numberGame(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int arr[] = new int[n];
        int i=0;
        int j=0;
        while(i<n){
            int alice = nums[i++];
            int bob = nums[i++];
            arr[j++]=bob;
            arr[j++]=alice;
        }
        return arr;
    }
}