class Solution {
    public void sortColors(int[] nums) {
        int i1=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==0){
                int temp = nums[i1];
                nums[i1]=0;
                nums[i]=temp;
                i1++;
            }
        }
        int i2=i1;
        for(int i=0;i<nums.length;i++){
             if (nums[i]==1){
                int temp = nums[i2];
                nums[i2]=1;
                nums[i]=temp;
                i2++;
            }
        }
        int i3=i2;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==2){
                int temp = nums[i3];
                nums[i3]=2;
                nums[i]=temp;
                i3++;
            }
        }
    }
}