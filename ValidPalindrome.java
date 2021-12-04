import java.util.*;
import java.util.lang.*;

class Solution {
    public boolean isPalindrome(String s) {
       /* String reverse=reverse(s);
        if(s.equals(reverse)){
             return true;
        }
        return false;
        int originalstring=s;
        for(int i=s.length;i>=0;i--)
            if(originalstring==reversestring)
                return true;
        else 
            return false;*/
         if(s==null){
            return false;
         }
 
    s = s.toLowerCase();
 
    int i=0;
    int j=s.length()-1;
 
    while(i<j){
        while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z') 
                    || (s.charAt(i)>='0'&&s.charAt(i)<='9'))){
            i++;
        }
 
        while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z') 
                    || (s.charAt(j)>='0'&&s.charAt(j)<='9'))){
            j--;
        }
 
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
 
        i++;
        j--;
    }
 
    return true;
    }
}
