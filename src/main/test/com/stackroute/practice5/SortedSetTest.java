package com.stackroute.practice5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;

public class SortedSetTest {

    SortedSet obj;
    @Before
    public void setUp() throws Exception {
        obj=new SortedSet();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void sortSetTest1() {
        HashSet<String> set=new HashSet<>();
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        set.add("Harry");
        set.add("Olive");

        ArrayList<String> arr=new ArrayList<>();
        arr.add("Alice");
        arr.add("Bluto");
        arr.add("Eugene");
        arr.add("Harry");
        arr.add("Olive");
        assertEquals("Error",arr,obj.sortSet(set));
    }

    @Test
    public void sortSetTest2() {
        HashSet<String> set=new HashSet<>();
        set.add("Alice");
        set.add("Carner");
        set.add("Bluto");
        set.add("Harry");
        set.add("Olive");

        ArrayList<String> arr=new ArrayList<>();
        arr.add("Alice");
        arr.add("Bluto");
        arr.add("Carner");
        arr.add("Harry");
        arr.add("Olive");
        assertEquals("Error",arr,obj.sortSet(set));
    }
    @Test
    public void sortSetTest3() {
        HashSet<String> set=new HashSet<>();
        set.add("Alice");
        set.add("Carner");
        set.add("Bluto");
        set.add("Harry");
        set.add("Olive");
        set.add("Nandan");
        set.add("Nayak");

        ArrayList<String> arr=new ArrayList<>();
        arr.add("Alice");
        arr.add("Bluto");
        arr.add("Carner");
        arr.add("Harry");
        arr.add("Nandan");
        arr.add("Nayak");
        arr.add("Olive");
        assertEquals("Error",arr,obj.sortSet(set));
    }


    @Test
    public void sortSetFailure() {
        HashSet<String> set=new HashSet<>();
        set.add("Alice");
        set.add("Carner");
        set.add("Bluto");
        set.add("Harry");
        set.add("Olive");
        set.add("Nandan");
        set.add("Nayak");

        assertNotNull("Error",obj.sortSet(set));

    }


}