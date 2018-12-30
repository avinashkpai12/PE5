package com.stackroute.practice5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrListTest {

    private static ArrList arrList;

    @org.junit.Before
    public void setUp() throws Exception {
        arrList = new ArrList();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        arrList = null;
    }

    @Test
    public void testArrList() throws Exception{

        List<String> list = new ArrayList<String>();
        list.add("Kiwi");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");

        assertEquals(list, arrList.replace("Kiwi", 0));
    }
}