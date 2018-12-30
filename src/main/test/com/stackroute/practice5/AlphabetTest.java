package com.stackroute.practice5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class AlphabetTest {

    private static Alphabet alphabet;

    @Before
    public void setUp() throws Exception {
        alphabet = new Alphabet();
    }

    @After
    public void tearDown() throws Exception {
        alphabet = null;
    }

    @Test
    public void testAlphabetTest1() throws  Exception{

        HashMap<String, Boolean> expected = new HashMap<String, Boolean>();
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", true);
        expected.put("d", false);
        String s[] = {"a","b","c","d","a","c","c"};
        assertEquals("Error",expected,alphabet.count(s));
    }

    @Test
    public void testAlphabetTest2() throws  Exception{

        HashMap<String, Boolean> expected = new HashMap<String, Boolean>();
        expected.put("a", false);
        expected.put("b", false);
        expected.put("c", false);
        expected.put("d", false);
        String s[] = {"a","b","c","d"};
        assertEquals("Error",expected,alphabet.count(s));
    }


}