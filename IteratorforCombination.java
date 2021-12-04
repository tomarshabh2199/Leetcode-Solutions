import java.util.*;
import java.util.lang.*;
import java.io.*;

class CombinationIterator {
     private String s;
     Queue<String>q;
     private void getcombination(int start,int length, StringBuilder txt){
        if(length==0){ 
            q.add(txt.toString());
            return ;
        }
        for(int i=start; i<=s.length()-length; ++i){ 
            txt.append(s.charAt(i));
        getcombination(i+1,length-1,txt);
            txt.deleteCharAt(txt.length()-1);
        }
    }
        public CombinationIterator(String characters, int combinationLength) {
          s=characters;
            q=new LinkedList();
    getcombination(0,combinationLength,new StringBuilder());
}
   public String next() {
        return q.poll();
    }
    
    public boolean hasNext() {
        return !q.isEmpty();
    }
}
