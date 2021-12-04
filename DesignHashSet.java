import java.util.*;
import java.util.lang.*;
import java.io.*;

class MyHashSet {

    /** Initialize your data structure here. */
  List<Integer>list=new ArrayList<>();
    public MyHashSet() {
       list=new ArrayList<>();
    }
    
    public void add(int key) {
        list.add(key);
        
    }
    
    public void remove(int key) {
        Iterator<Integer>it=list.iterator();
        while(it.hasNext()){ int value=it.next();
                           if(value==key) {
                               it.remove();
                           }}
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(list.contains(key))return true;
        else return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
