package com.company;

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
        Student[] pupil = new Student[4];
        Student pupil1 = new Student("Anton", "Petrow", 23, address1 );
        Student pupil2 = new Student("Artem","Filipow", 21, address2);
        Student pupil3 = new Student("Igor", "Sergeew", 20, address3);
        Student pupil4 = new Student("Inna", "Kruk", 22, address4);
        for (int i = 0;  i < pupil.length; i ++) {


//        pupil[0] = pupil1;
//        pupil[1] = pupil2;
//        pupil[2] = pupil3;
//        pupil[3] = pupil4;

            System.out.println(pupil[i]);

        }
    }
}
