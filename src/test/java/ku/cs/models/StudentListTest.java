package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList list = new StudentList();

    @BeforeEach
    void init(){
        list.addNewStudent("6610407521","Marf",50);
        list.addNewStudent("6610407522","Mary",80);
        list.addNewStudent("6610407523","Alice",35);
    }
    
    @Test
    void testFindStudent() {
        Student student = new Student("6610407521","Marf");
        Student student_from_list = list.findStudentById("6610407521");

        String expected = "Marf";
        String actual = student_from_list.getName();
        assertEquals(expected, actual);
    }

    @Test
    void testGiveScoreToID(){
        list.giveScoreToId("6610407523",30);
        Student student = list.findStudentById("6610407523");
        assertEquals(65,student.getScore());
    }

    @Test
    void testViewGradeOfID(){
    String grade = list.viewGradeOfId("6610407522");
    assertEquals("A",grade);
    }

}