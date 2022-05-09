package com.company.stream;

import com.company.Address;
import com.company.Teacher;

import java.util.List;

public class Filtr {
    public static List<Teacher> teacherList(){

        Address address1 = new Address("Minsk", "Esenina", 120, 15);
        Address address2 = new Address("Grodno", "Mira", 34, 56);
        Address address3 = new Address("Brest", "Centralnaya", 87, 2);
        Address address4 = new Address("Mogilew", "Lenina", 167, 94);
        return List.of(
        new Teacher("Anton", "Fillipov", 35, 12, 9, 2, address1),
        new Teacher("Irina", "Frolova", 21, 10, 8, 1, address2),
        new Teacher("Alina", "Ivanova", 22, 20, 9, 1, address3),
        new Teacher("Kirill", "Shpak", 21, 15, 8, 1, address4)
        );
    }
}
