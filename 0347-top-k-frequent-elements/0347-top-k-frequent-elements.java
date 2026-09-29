class Pair{
    int num;
    int freq;
    Pair(int num,int freq){
        this.num=num;
        this.freq=freq;
    }
    public String toString(){
        return num+" "+freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.freq-a.freq);
        int ans[] = new int[k];
        for (int x:nums){
            int freq = map.getOrDefault(x,0);
            map.put(x,freq+1);
        }
        map.forEach((key, value) -> {
         pq.add(new Pair(key,value));
        });
        System.out.print(pq.toString());
        for (int i=0;i<k;i++){
            ans[i]=pq.poll().num;
        }
        return ans;
    }
}