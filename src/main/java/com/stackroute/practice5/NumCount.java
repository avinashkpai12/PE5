package com.stackroute.practice5;

import java.util.HashMap;

public class NumCount {


    public HashMap<String,Integer> count(String s){

        String result = s.replaceAll("[-+.^:,@___<>*?_]", " ");
        HashMap<String, Integer> resultMap = new HashMap<>();
        String []str1=result.split(" ");
        for(int i=0;i<str1.length;i++)
        {

            if(resultMap.get(str1[i])==null)
            {
                resultMap.put(str1[i],1);
            }
            else
                resultMap.put(str1[i],resultMap.get(str1[i])+1);
        }
        resultMap.remove("");
        return resultMap;
    }

    public static void main(String args[]){

    }
}
