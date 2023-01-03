class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int e:nums){
            p.offer(e);
            if(p.size()>k) p.poll();
        }
        return p.peek();
    }
}
