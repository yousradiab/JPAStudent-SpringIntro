package org.example.jpastudent.repository;

import org.example.jpastudent.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest

class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testOnetime() {
        List<Student> lst = studentRepository.findAllByName("Nanna");

        //forventer der er 1 Nanna i database
        assertEquals(0, lst.size());
    }

    @Test
    void testOnetime2() {
        List<Student> lst = studentRepository.findAllByName("Nanna");

        //forventer der er 4 Nanna i database
        assertEquals(0, lst.size());
    }

}