// PALINDROME CHECKER USING TWO POINTER APPROACH 
//PASS THE STRING PARAMETER IN MAIN METHOD 
public static boolean isPalindrome(String str){
        //  two pointer approach to check weather a string is palindrome or not 
         int l = 0;                                              // lower key
         int r = str.length() - 1;                               //higher key
        
        while (l <= r && str.charAt(l) == str.charAt(r)) {      // l alwyas <= r  AND checking equality of both side character of string
            l++;                                                 
            r--;
        }
        
        return l >= r;                                          // return false l>=r else true if l<r
    
    }
