package com.stackroute.practice5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapObject {
    public LinkedHashMap<String,String > modify(LinkedHashMap<String,String> hashMap)
    {
        Iterator hashMapIterator = hashMap.entrySet().iterator();
        Map.Entry mapElement = (Map.Entry)hashMapIterator.next();
        String key1=(String)mapElement.getKey();
        String value1=(String)mapElement.getValue();

        mapElement = (Map.Entry)hashMapIterator.next();

        String key2=(String)mapElement.getKey();
        String value2=(String)mapElement.getValue();

        if(value1!=null) {
            value2 = value1;
            hashMap.put(key1," ");
            hashMap.put(key2,value2);

        }
        return hashMap;





    }
}
