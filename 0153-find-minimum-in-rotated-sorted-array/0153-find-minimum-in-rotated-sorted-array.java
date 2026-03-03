class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        int l=0,r=n-1;
        while(l<=r){
            int mid = (l+r)/2;
            if (arr[l]<=arr[mid]){
                if (ans>arr[l]){
                    ans=arr[l];
                }
            l=mid+1;
            }
            else
            {
                if (ans>arr[mid]){
                    ans = arr[mid];
                }
                r=mid-1;
            }

        }
        return ans;
    }
}