package com.stackroute.practice5;

import java.util.HashMap;


public class Alphabet {

    public static HashMap<String, Boolean> count(String[] str){

        HashMap<String, Boolean> maps = new HashMap<String, Boolean>();

        for(int i=0;i<str.length;i++){
            if(maps.get(str[i]) == null){
                maps.put(str[i], false);
            }
            else{
                maps.put(str[i], true);
            }
        }

        return maps;

    }

    public static void main(String args[]){

    }
}
