package com.stackroute.practice5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrList {



    public static List<String> replace(List<String> arrList, String existing, String replacing){

        Iterator it = arrList.iterator();

        boolean flag = false;
        int i=0;
        while (it.hasNext()){
            if(it.next().equals(existing)){
                arrList.set(i,replacing);
                flag = true;
            }
            i++;
        }

        return arrList;

    }

    public static void main(String args[]){



    }
}
