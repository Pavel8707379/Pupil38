package com.company;

import com.company.exception.AgeException;

public class Student extends AgeException {
        private String name;
        private String surname;
        private int age;
        private Address address;


    public String getName() {
            return name;
        }
        public String getSurname() {
            return surname;
        }
        public int getAge() {
            return age;
        }
        public Address getAddress() {
            return address;
        }
        public Student(String name, String surname, int age, Address address, String message) {
            super(message);
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.address = address;
        }
        public String toString() {
            return "Учащийся" + " | " + name + " " + surname + " " + age + " " + address.displayInfo();
        }
    }