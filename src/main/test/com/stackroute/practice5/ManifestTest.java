package com.stackroute.practice5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ManifestTest {

    private static Manifest manifest;

    @Before
    public void setUp() throws Exception {
        manifest = new Manifest();
    }

    @After
    public void tearDown() throws Exception {
        manifest = null;
    }

    @Test
    public void testCompareStudentsTest1() throws Exception{
        ArrayList<Student> expectedList = new ArrayList<Student>();
        expectedList.add(new Student(5,"Navami", 16 ));
        expectedList.add(new Student(4,"Pakki", 15 ));
        expectedList.add(new Student(3,"Avani", 14 ));
        expectedList.add(new Student(2,"Nandan", 13 ));
        expectedList.add(new Student(1,"Avinash", 12 ));

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"Avinash", 12 ));
        list.add(new Student(2,"Nandan", 13 ));
        list.add(new Student(3,"Avani", 14 ));
        list.add(new Student(4,"Pakki", 15 ));
        list.add(new Student(5,"Navami", 16 ));

        assertEquals("error", expectedList.toString(), manifest.compareStudent(list).toString());


    }

    @Test
    public void testCompareStudentsTest2() throws Exception{
        ArrayList<Student> expectedList = new ArrayList<Student>();
        expectedList.add(new Student(4,"Pakki", 15 ));
        expectedList.add(new Student(5,"Navami", 15 ));
        expectedList.add(new Student(3,"Avani", 14 ));
        expectedList.add(new Student(2,"Nandan", 13 ));
        expectedList.add(new Student(1,"Avinash", 12 ));

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"Avinash", 12 ));
        list.add(new Student(2,"Nandan", 13 ));
        list.add(new Student(3,"Avani", 14 ));
        list.add(new Student(4,"Pakki", 15 ));
        list.add(new Student(5,"Navami", 15 ));

        assertEquals("error", expectedList.toString(), manifest.compareStudent(list).toString());


    }

    @Test
    public void testCompareStudentsTest3() throws Exception{
        ArrayList<Student> expectedList = new ArrayList<Student>();
        expectedList.add(new Student(5,"Navami", 16 ));
        expectedList.add(new Student(4,"Pakki", 15 ));
        expectedList.add(new Student(2,"Pakki", 15 ));
        expectedList.add(new Student(3,"Avani", 14 ));
        expectedList.add(new Student(1,"Avinash", 12 ));

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1,"Avinash", 12 ));
        list.add(new Student(2,"Pakki", 15 ));
        list.add(new Student(4,"Pakki", 15 ));
        list.add(new Student(3,"Avani", 14 ));
        list.add(new Student(5,"Navami", 16 ));

        assertEquals("error", expectedList.toString(), manifest.compareStudent(list).toString());


    }
}