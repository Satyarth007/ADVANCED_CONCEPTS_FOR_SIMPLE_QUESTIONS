class Solution:
    def countTriples(self, n: int) -> int:
        l=[x**2 for x in range(1,n+1)]
        count=0
        for i in range(0,len(l)-1):
            for j in range(0,len(l)):
                s=l[i]+l[j]
                if s in l and (l[i]!=l[j]):
                    count+=1
                

        return count
