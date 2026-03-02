class Solution {
    int upperbound(int[] nums,int target){
        int n = nums.length;
        int low = 0 , high =(n)-1;
        int ans = n;
        while (low<=high){
            int mid = (low+high)/2;
            if (nums[mid]>target){
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }
    int lowerbound(int[] nums,int target){
        int n = nums.length;
        int low = 0 , high =(n)-1;
        int ans = n;
        while (low<=high){
            int mid = (low+high)/2;
            if (nums[mid]>=target){
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) 
    {
        int n = nums.length;
        int ans[] = new int[2];
        int first = lowerbound(nums,target);
        int last = upperbound(nums,target);
        if (first==n && last==n){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        if(nums[first]==target && nums[last-1]==target){
        ans[0]=first;
        ans[1]=last-1;
        return ans;
        } 
        ans[0]=-1;
        ans[1]=-1;
        return ans;
    }
}