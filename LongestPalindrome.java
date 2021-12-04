
//JAVA Solution
import java.util.*;
import java.util.lang.*;
import java.io.*;

class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer>counts=new HashMap();
        for(char c:s.toCharArray())
            counts.put(c,counts.getOrDefault(c,0)+1);
        
        int result=0;
        boolean odd_found=false;
        for(int c:counts.values()){
            if(c%2==0)result+=c;
            else{
                odd_found=true;
                result+=c-1;
                
            }
        }
      if(odd_found)result++;
        return result;
    }
}
