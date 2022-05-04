package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


    }

        public static List<Teacher> teachers() {
            Address address1 = new Address("Minsk", "Esenina", 120, 15);
            Address address2 = new Address("Grodno", "Mira", 34, 56);
            Address address3 = new Address("Brest", "Centralnaya", 87, 2);
            Address address4 = new Address("Mogilew", "Lenina", 167, 94);

            Teacher teacher = new Teacher("Anton", "Fillipov", 35, 12, 9, 2, address1);
            Teacher teacher1 = new Teacher("Irina", "Frolova", 21, 10, 8, 1, address2);
            Teacher teacher2 = new Teacher("Alina", "Ivanova", 22, 20, 9, 1, address3);
            Teacher teacher3 = new Teacher("Kirill", "Shpak", 21, 15, 8, 1, address4);
            List<Teacher>teachers = new ArrayList<>();
            teachers.add(teacher);
            teachers.add(teacher1);
            teachers.add(teacher2);
            teachers.add(teacher3);
            return teachers();
        }

        public static Stream<Teacher> teacherFilter(List<Teacher>teachers) {
            Stream stream = teachers.stream();

            teachers.stream().filter(s -> s.getName().equals("A")).forEach(s -> System.out.println(s));
            return stream;
        }
    }



//        pupil[0] = pupil1;
//        pupil[1] = pupil2;
//        pupil[2] = pupil3;
//        pupil[3] = pupil4;



        }
