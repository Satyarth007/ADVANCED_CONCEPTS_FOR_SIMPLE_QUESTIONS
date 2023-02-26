class Solution {
    public int minimumSum(int num) {
        String s=String.valueOf(num);
        char c[]=s.toCharArray();
        Arrays.sort(c);
        String a= c[0]+""+c[2];
        String b= c[1]+""+c[3];
         return Integer.parseInt(a)+Integer.parseInt(b);
        
    }
}
