package com.company.util;

import com.company.Student;
import com.company.Teacher;
import com.company.exception.StudentException;
import com.company.exception.TeacherException;

public class AgeUtil {

    public static void checkAge (int age) {
        try {
            checkAgeTeacher(age);
        } catch (Teacher e) {
            e.printStackTrace();
            try {
                checkAgeStudent(age);
            } catch (Student ex) {
                ex.printStackTrace();
            }
        } finally {
            System.out.println("Конец");
        }
    }
        private static void checkAgeTeacher ( int age) throws Teacher {
            if (age > 70) {
                throw new Teacher("Пенсионный возраст");
            }
        }
        private static void checkAgeStudent ( int age) throws Student {
            if (age < 16) {
                throw new Student();
            }
        }
    }
