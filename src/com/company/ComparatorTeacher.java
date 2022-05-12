package com.company;

import com.company.model.Teacher;

import java.util.Comparator;

public class ComparatorTeacher implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getAge() - o2.getAge();
    }
}

