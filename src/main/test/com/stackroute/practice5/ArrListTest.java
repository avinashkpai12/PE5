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
    public void testArrListTest1() throws Exception{

        List<String > sendList = new ArrayList<String>();
        sendList.add("Apple");
        sendList.add("Grape");
        sendList.add("Melon");
        sendList.add("Berry");

        List<String> expectedList = new ArrayList<String>();
        expectedList.add("Kiwi");
        expectedList.add("Grape");
        expectedList.add("Melon");
        expectedList.add("Berry");

        assertEquals(expectedList, arrList.replace(sendList, "Apple", "Kiwi"));
    }

    @Test
    public void testArrListTest2(){

        List<String > sendList = new ArrayList<String >();

        List<String > expextedList = new ArrayList<String>();


        assertEquals(expextedList, arrList.replace(sendList,"Apple", "Kiwi"));
    }

    @Test
    public void testArrListTest3() throws Exception{

        List<String > sendList = new ArrayList<String>();
        sendList.add("Mango");
        sendList.add("Grape");
        sendList.add("Melon");
        sendList.add("Berry");

        List<String> expectedList = new ArrayList<String>();
        expectedList.add("Mango");
        expectedList.add("Grape");
        expectedList.add("Melon");
        expectedList.add("Berry");

        assertEquals(expectedList, arrList.replace(sendList, "Apple", "Kiwi"));
    }


    @Test
    public void testArrListTest4() throws Exception{

        List<String > sendList = new ArrayList<String>();
        sendList.add("Mango");
        sendList.add("Grape");
        sendList.add("Melon");
        sendList.add("Berry");

        List<String> expectedList = new ArrayList<String>();
        expectedList.add("Mango");
        expectedList.add("");
        expectedList.add("Melon");
        expectedList.add("Berry");

        assertEquals(expectedList, arrList.replace(sendList, "Grape", ""));
    }


}