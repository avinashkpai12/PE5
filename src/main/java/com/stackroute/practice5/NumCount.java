package com.stackroute.practice5;

import java.util.HashMap;

public class NumCount {


    public HashMap<String,Integer> count(String s){

        String result = s.replaceAll("[-+.^:,@___<>*?_]", " ");
        HashMap<String, Integer> map = new HashMap<>();
        String []str1=result.split(" ");
        for(int i=0;i<str1.length;i++)
        {

            if(map.get(str1[i])==null)
            {
                map.put(str1[i],1);
            }
            else
                map.put(str1[i],map.get(str1[i])+1);
        }
        map.remove("");
        return map;
    }

    public static void main(String args[]){

    }
}
