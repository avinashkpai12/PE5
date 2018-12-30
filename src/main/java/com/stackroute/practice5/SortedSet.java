package com.stackroute.practice5;

import java.util.*;

public class SortedSet {
    public ArrayList<String> sortSet(HashSet<String> hash_Set)
    {
        Set<String> treeSet = new TreeSet<String>(hash_Set);
        Iterator<String> it=treeSet.iterator();
        ArrayList<String>list1=new ArrayList<>();
        while(it.hasNext())
        {
            list1.add(it.next());
        }
        return list1;

    }
}
