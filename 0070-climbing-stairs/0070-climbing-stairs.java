class Solution {
    int jumps(int n,int arr[]){
        if (n<=1)
        return 1;
        if (arr[n]!=-1){
            return arr[n];
        }
        return arr[n]=jumps(n-1,arr)+jumps(n-2,arr);
    }
    public int climbStairs(int n) {
        int array[] = new int[n+1];
        for (int i=0;i<=n;i++)
        array[i]=-1;
        return jumps(n,array);
    }
}