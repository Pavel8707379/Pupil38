package com.company;

public class Student {
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
        public Student(String name, String surname, int age, Address address) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.address = address;
        }
        public String displayInfo() {
            return "Учащийся" + " | " + name + " " + surname + " " + age + " " + address.displayInfo();
        }
    }