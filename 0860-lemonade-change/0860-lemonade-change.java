class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for (int x:bills){
            if (x==5)
                five++;
            else if (x==10){
                if (five<1){
                    return false;
                }
                ten++;
                five--; 
            }
            else{
                if(five>=1 && ten>=1){
                    ten--;
                    five--;
                    twenty++;
                }
               else if (five>=3){
                    five=five-3;
                    twenty++;
                }
                else{
                    return false;
                }
            }
        }
        return true;   
    }
}