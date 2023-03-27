class Solution {
    public boolean sdn(int n){
       
        int temp=n;
        while(n!=0){
            if(n%10 ==0  || temp%(n%10)!=0) return false;
            n=n/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> al=new ArrayList<>();
        for(int i=left;i<=right;i++){
            
            if(sdn(i)) al.add(i);
        }
        return al;

    }
}
