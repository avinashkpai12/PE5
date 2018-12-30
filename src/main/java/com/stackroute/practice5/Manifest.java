package com.stackroute.practice5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Manifest {

    public static ArrayList<Student> compareStudent(List<Student> students){

        ArrayList<Student> student = new ArrayList<Student>(students);
        Collections.sort(student, new StudentSorter());

        return student;
    }

    public static void main(String args[]){

        ArrayList<Student> listStudent = new ArrayList<Student>();

        listStudent.add(new Student(1,"Avinash", 12));
        listStudent.add(new Student(1,"Nandan", 13));
        listStudent.add(new Student(1,"Avani", 14));
        listStudent.add(new Student(1,"Pakki", 15));
        listStudent.add(new Student(1,"Navami", 16));

        Collections.sort(listStudent, new StudentSorter());

        for(int i=0;i<listStudent.size();i++){
            System.out.println(listStudent.get(i).toString());
        }


    }
}
