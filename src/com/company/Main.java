package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Address address1 = new Address("Minsk", "Esenina", 120,15);
        Address address2 = new Address("Grodno", "Mira", 34, 56);
        Address address3 = new Address("Brest", "Centralnaya", 87, 2);
        Address address4 = new Address("Mogilew", "Lenina", 167, 94);

        Student student = new Student("Anton", "Fillipov", 23,address1);
        Student student1 = new Student("Irina", "Frolova", 21,  address2);
        Student student2 = new Student("Alina", "Ivanova", 22, address3);
        Student student3 = new Student("Kirill", "Shpak", 21, address4);

        Teacher teacher1 = new Teacher("Inga", "Vasilevna", 43, 15, 7, 1,address1);
        Teacher teacher2 = new Teacher("Igor", "Petrow", 45, 22, 9, 1, address2);
        Teacher teacher3 = new Teacher("Ignat", "Ivanov", 50, 14, 9, 2, address3);
        Teacher teacher4 = new Teacher("Olga", "Kurinkova", 35, 21, 9, 1, address4);

       List<Teacher> teachers = new ArrayList<Teacher>() {{
               add(teacher1);
               add(teacher2);
               add(teacher3);
               add(teacher4);
           }};
       teachers.stream().sorted().forEach(teacher -> System.out.println(teacher));
        System.out.println();

        Comparator teacherComparator = new ComparatorTeacher();
        teachers.stream().sorted(teacherComparator).forEach(teacher -> System.out.println(teacher));
    }
}
