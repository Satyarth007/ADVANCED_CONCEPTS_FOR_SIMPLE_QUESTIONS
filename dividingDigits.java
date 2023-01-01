class Solution {
    public int countDigits(int num) {
        int count=0;
        int temp=num;
        while(num>0){
            if(temp%(num%10)==0) count++;
            num=num/10;
        }
        return count;
    }
}
