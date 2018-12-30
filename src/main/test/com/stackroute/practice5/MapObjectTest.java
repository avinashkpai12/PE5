package com.stackroute.practice5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class MapObjectTest {
   private static MapObject mapObject;
    @Before
    public void setUp() throws Exception {
        mapObject=new MapObject();
    }

    @After
    public void tearDown() throws Exception {
        mapObject=null;
    }

    @Test
    public void modify() {
        LinkedHashMap<String ,String> hm=new LinkedHashMap<>();
        hm.put("val1","java");
        hm.put("val2","c++");
        HashMap<String ,String> res=new HashMap<>();
        res.put("val1"," ");
        res.put("val2","java");

        assertEquals("Error",res,mapObject.modify(hm));
    }
    @Test
    public void modify1() {
        LinkedHashMap<String ,String> hm=new LinkedHashMap<>();
        hm.put("val1","Avinash");
        hm.put("val2","Pai");
        HashMap<String ,String>res=new HashMap<>();
        res.put("val1"," ");
        res.put("val2","Avinash");

        assertEquals("Error",res,mapObject.modify(hm));
    }
    @Test
    public void modifyFailure() {
        LinkedHashMap<String ,String> hm= new LinkedHashMap<>();
        hm.put("val1","Avinash");
        hm.put("val2","Pai");


        assertNotNull("Error",mapObject.modify(hm));
    }

}