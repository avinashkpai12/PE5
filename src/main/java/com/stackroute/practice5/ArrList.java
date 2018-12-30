package com.stackroute.practice5;

import java.util.ArrayList;
import java.util.List;

public class ArrList {



    public static List<String> replace(String s, int n){

        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");

        list.set(n, s);

        return list;

    }

    public static void main(String args[]){



    }
}
