class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for (int x:stones){
            pq.add(x);
        }
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            int diff = first-second;
            pq.add(diff);
        }
        return pq.peek();
    }
}