package test.com.company;


import com.company.model.Address;
import com.company.model.Teacher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TeacherTest {

 Teacher teacher;


   @Before
    public void setUp() throws Exception {
    Address address = new Address("Minsk","Esenina", 120,20);
    teacher = new Teacher("Igor","Ivanov", 12, address, 25, 10,2);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calkulation() {


        teacher.calkulation();
        int day = 25;
        int rate = 10;
        int time = 2;
        int result = (day * rate) * time;
        double realResult = teacher.calkulation();
        assertTrue(result == realResult);


    }
    @Test
 public void setAgeWithZero(){
     int age1 = 12;
     int ageNot = -20;
     teacher.setage(ageNot);
     assertTrue(teacher.getAge() == age1);
    }

}