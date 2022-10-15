class Solution {
    public String removeOccurrences(String s, String part) {
       
        int partLen=part.length();
        
        while(s.contains(part)){
            int l=s.indexOf(part);
            s= s.substring(0,l)+s.substring(l+partLen,s.length());
        }
       return s; 
    }
}
