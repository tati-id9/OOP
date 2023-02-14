package org.hw_03;

import org.hw_03.Model.Student;

import java.util.Comparator;


public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }

}