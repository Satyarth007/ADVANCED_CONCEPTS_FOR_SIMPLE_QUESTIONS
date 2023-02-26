class Solution {
    public int rev(int n){
        int x=0;
        while(n!=0){
            x= x*10+ (n%10);
            n=n/10;
        }
        return x;
    }
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int rev1=rev(temp);
        int rev2=rev(rev1);
        return rev2==num;

    }
}
