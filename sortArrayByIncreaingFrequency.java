class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int e:nums) hm.put(e,hm.getOrDefault(e,0)+1);

        List<Integer> al= new ArrayList<>(hm.keySet());
        // mystery for me as well
        Collections.sort(al,(a,b)->{
            return hm.get(a)==hm.get(b) ? b-a : hm.get(a)-hm.get(b);   // lambda function sort according to value
        });

        int k=0;
        for(int x:al){
            for(int i=0;i<hm.get(x);i++) nums[k++]=x;
        }
        return nums;
        
        
        
    }
}
