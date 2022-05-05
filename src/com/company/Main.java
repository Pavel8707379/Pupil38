package com.company;

import com.company.base.Box;
import com.company.model.Car;
import com.company.model.Site;
import com.company.model.util.MaxPowerCarComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Box<String>boxString = new Box<String>("Hello");
        System.out.println(boxString.getT());
        System.out.println();

        Box<Integer>integerBox = new Box<Integer>(45);
        System.out.println(integerBox.getT());

        System.out.println();

        List<Box>boxes = new ArrayList<Box>(){{
            add(integerBox);
            add(boxString);
        }};
        boxes.stream().filter(b -> b.getT().equals("111")).forEach(box -> System.out.println(box));

        Car car1 = new Car("Blue", 120, "BMW");
        Car car2 = new Car("Red", 20, "MB");
        Car car3 = new Car("Black", 200, "Lada");

        List<Car>cars = new ArrayList<Car>() {{
            add(car1);
            add(car2);
            add(car3);
            }};
          cars.stream().sorted().forEach(car -> {System.out.println(car);});
        System.out.println();

        Site site1 = new Site("Jdanovichi", 125, 200000);
        Site site2 = new Site("Malinovka", 300, 75000);
        Site site3 = new Site("Drozdj", 230, 10000);
        List<Site> sites = new ArrayList<Site>() {{
            add(site1);
            add(site2);
            add(site3);
        }};
         sites.stream().sorted().forEach(z -> System.out.println(z));

        System.out.println();

        Comparator powerComparator = new MaxPowerCarComparator();
        cars.stream().sorted(powerComparator).forEach(x -> System.out.println(x));


//        List<Integer> numbers = new ArrayList<Integer>(){{
//            add(10);
//            add(30);
//            add(20);
//        }};
//        numbers.stream().sorted().forEach(n -> System.out.println(n));
    }
}

        //Students = {st1, st2, st3} ->
        //{st1, null,st3} ->
        //{st1, st3}
        //
        //if(Students[i] == st2){
        //	Students[i] = null;
        //}

//        Address address1 = new Address("Minsk", "Esenina", 120,15);
//        Address address2 = new Address("Grodno", "Mira", 34, 56);
//        Address address3 = new Address("Brest", "Centralnaya", 87, 2);
//        Address address4 = new Address("Mogilew", "Lenina", 167, 94);
//        Student student = new Student("Anton", "Fillipov", 23,address1);
//        Student student1 = new Student("Irina", "Frolova", 21,  address2);
//        Student student2 = new Student("Alina", "Ivanova", 22, address3);
//        Student student3 = new Student("Kirill", "Shpak", 21, address4);
//
//        ArrayList<Student> result = new ArrayList<>();
//        result.add(0, student);
//        result.add(1, student1);
//        result.add(2, student2);
//        for (Student s : result) {
//            System.out.println(s);






//        pupil[0] = pupil1;
//        pupil[1] = pupil2;
//        pupil[2] = pupil3;
//        pupil[3] = pupil4;




