class Solution {
    public int addDigits(int num) {
        int temp = num;
        int ans = 0;
        if (num%10!=0 && num/10==0){
            return num;
        }
        while (temp/10!=0){
            ans=0;
            while(temp>0){
                int rem = temp%10;
                ans = ans + rem;
                temp=temp/10;
            }
            temp=ans;
        }

        return ans;
    }
}