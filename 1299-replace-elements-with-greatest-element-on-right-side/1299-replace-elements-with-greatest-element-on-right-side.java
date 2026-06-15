class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int replace = -1;
        for (int i=n-1;i>=0;i--){
            int temp = arr[i];
            arr[i]=replace;
            replace = Math.max(replace,temp);
        }
        return arr;
    }
}