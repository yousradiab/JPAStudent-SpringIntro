package org.example.jpastudent.repository;

import org.example.jpastudent.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testOnetime() {
        List<Student> lst = studentRepository.findAllByName("Nanna");

        //forventer der er 1 Nanna i database
        assertEquals(4, lst.size());
    }

    @Test
    void testOnetime2() {
        List<Student> lst = studentRepository.findAllByName("Nanna");

        //forventer der er 1 Nanna i database
        assertEquals(4, lst.size());
    }

}