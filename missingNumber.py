class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        
        s1=sum(nums)
        s2=0
        for i in range(1,len(nums)+1): s2+=i
        return s2-s1
