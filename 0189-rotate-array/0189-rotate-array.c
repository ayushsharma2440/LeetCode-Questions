void rotate(int* nums, int numsSize, int k) {
    k=k%numsSize;
    for (int i=0;i<numsSize/2;i++){
        int temp = nums[numsSize-i-1];
        nums[numsSize-i-1] = nums[i];
        nums[i] = temp;
    }
     for (int i=0;i<k/2;i++){
        int temp = nums[k-1-i];
        nums[k-i-1] = nums[i];
        nums[i] = temp;
    }
    int count=0;
    for (int i=k;i<=(k+numsSize-1)/2;i++){
        int temp = nums[numsSize-count-1];
        nums[numsSize-count-1] = nums[i];
        nums[i] = temp;
        count++;
    }

}