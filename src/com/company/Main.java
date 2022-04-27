package com.company;

import com.company.exception.AgeException;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Students = {st1, st2, st3} ->
        //{st1, null,st3} ->
        //{st1, st3}
        //
        //if(Students[i] == st2){
        //	Students[i] = null;
        //}

        Address address1 = new Address("Minsk", "Esenina", 120,15);
        Address address2 = new Address("Grodno", "Mira", 34, 56);
        Address address3 = new Address("Brest", "Centralnaya", 87, 2);
        Address address4 = new Address("Mogilew", "Lenina", 167, 94);

        Student student = new Student("Anton", "Fillipov", 23,address1);
        Student student1 = new Student("Irina", "Frolova", 21,  address2);
        Student student2 = new Student("Alina", "Ivanova", 22, address3);
        Student student3 = new Student("Kirill", "Shpak", 21, address4);

        ArrayList<Student> result = new ArrayList<>();
        result.add(0, student);
        result.add(1, student1);
        result.add(2, student2);

        result.remove(1);
        result.get(0);
        result.get(1);

        result.forEach (s -> {
            System.out.println(s);});

    }
}








