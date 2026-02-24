class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length + nums2.length];
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            array[i] = nums1[i];
            j++;
        }
        for (int i = 0; i < nums2.length; i++) {
            array[j] = nums2[i];
            j++;
        }
        for (int i = 0 ; i<array.length;i++){
            for (int k = 0 ; k<array.length;k++){
                if (array[i]<array[k]){
                    int temp = array[i];
                    array[i] = array[k];
                    array[k]=temp;
                }
            }
        }
        if((array.length)%2==0){
            float value = (float)(array[(array.length/2)-1]+array[array.length/2])/2;
            return value;
        }
        else{
            int value = (array[(array.length/2)]);
            return value;
        }
    }
}