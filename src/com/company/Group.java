package com.company;


    public class Group {
        private String groupName;
        private int course;
        private Student student;
        private  Teacher teacher;
        private Student[] pupil;

        public void setPupil(Student[] pupil) {
            this.pupil = pupil;
        }

        public Group(Student[] pupil) {
            this.pupil = pupil;

        }

        public void setStudents(Student[] pupil) {
            this.pupil = pupil;
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
        public Group(String groupName, int course, Student student, Teacher teacher, Student[] pupil) {
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
