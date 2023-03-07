class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int x=nums.length/2;
        return nums[x]==nums[x+1]?nums[x+1]:nums[x-1];
        
    }
}
