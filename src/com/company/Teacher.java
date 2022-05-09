package com.company;

    public class Teacher {
        public String name;
        private String surName;
        private int age;
        private int day;           // день
        private int time;         // время
        private double rate;     //ставка
        private Address address;
        double sum;

        public double getSum() {
            return sum;
        }
        public int getDay() {
            return day;
        }
        public int getTime() {
            return time;
        }
        public double getRate() {
            return rate;
        }
        public String getName() {
            return name;
        }
        public String getSurName() {
            return surName;
        }
        public int getAge() {
            return age;
        }
        public Address getAddress() {
            return address;
        }
        public Teacher(String name, String surName, int age, int day, int time, int rate, Address address) {
            this.name = name;
            this.surName = surName;
            this.age = age;
            this.address = address;
            this.day = day;
            this.time = time;
            this.rate = rate;
        }
        void calkulation () {
            double sum = (rate * time) * day;
            System.out.println(sum);
        }
        public String displayInfo(){
            return  "Преподаватель" + " |" + name + " " + surName + " " + age + " " + address.displayInfo() + " " + "ЗП" + " | " + sum;
        }

        @Override
        public String toString() {
            return "Teacher{" +
                    "name='" + name + '\'' +
                    ", surName='" + surName + '\'' +
                    ", age=" + age +
                    ", day=" + day +
                    ", time=" + time +
                    ", rate=" + rate +
                    ", address=" + address +
                    ", sum=" + sum +
                    '}';
        }
    }
