class Solution:
    def maximum69Number (self, num: int) -> int:
        nums=str(num)
        if '6' not in nums:
            return num
        else:
            return int(nums[:nums.index('6')]+'9'+nums[nums.index('6')+1:])


                 
