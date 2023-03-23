class Solution {
    public int minMoves(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int e:nums) ans+=(e-nums[0]);
        return ans;
        
    }
}
