class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (int i=0;i<moves.length();i++){
            Character s = moves.charAt(i);
            if (s=='U')
                y=y+1;
            else if (s=='D')
                y=y-1;
            else if (s=='L')
                x=x-1;
            else if (s=='R')
                x=x+1;
        }
        return (x==0 && y==0);
    }
}