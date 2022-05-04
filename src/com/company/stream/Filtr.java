package com.company.stream;

import com.company.Address;
import com.company.Teacher;

import java.util.List;

public class Filtr {
    public static List<Teacher> teacherList(){
        return List.of(
               Address address1 = new Address("Minsk", "Esenina", 120, 15),
        Address address2 = new Address("Grodno", "Mira", 34, 56),
        Address address3 = new Address("Brest", "Centralnaya", 87, 2),
        Address address4 = new Address("Mogilew", "Lenina", 167, 94),

        Teacher teacher = new Teacher("Anton", "Fillipov", 35, 12, 9, 2, address1),
        Teacher teacher1 = new Teacher("Irina", "Frolova", 21, 10, 8, 1, address2),
        Teacher teacher2 = new Teacher("Alina", "Ivanova", 22, 20, 9, 1, address3),
        Teacher teacher3 = new Teacher("Kirill", "Shpak", 21, 15, 8, 1, address4),
        );
    }
}
