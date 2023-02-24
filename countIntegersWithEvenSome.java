class Solution {
    public boolean evenDigitSum(int n){
        int sum=0;
        while(n!=0){
            sum+= n%10;
            n/=10;
        }
        return sum%2==0;

    }
    public int countEven(int num) {
        if(num==1) return 0;
        int count=0;
        for(int i=num;i>=2;i--){
            if(i< 10 && i%2==0) count++;
            else if(evenDigitSum(i)) count++;
        }
        return count;
        
    }
}
