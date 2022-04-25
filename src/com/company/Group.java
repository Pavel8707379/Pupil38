package com.company;


import java.util.ArrayList;

public class Group {
        private String groupName;
        private int course;
        private Student student;
        private  Teacher teacher;
        private ArrayList<Student> pupil;


    public ArrayList<Student> getPupil() {
        return pupil;
    }

    public String getGroupName() {
            return groupName;
        }
        public int getCourse() {
            return course;
        }
        public Student getStudent() {
            return student;
        }
        public Teacher getTeacher() {
            return teacher;
        }
        public Group(String groupName, int course, Student student, Teacher teacher, ArrayList<Student>pupil) {
            this.groupName = groupName;
            this.course = course;
            this.student = student;
            this.teacher = teacher;
            this.pupil = pupil;
        }
        public void displayInfo(){
            System.out.println("Группа" + " | " + groupName + " " + "Курс" + " | " + course + " " + student.displayInfo() + " " + teacher.displayInfo());
        }
    }
