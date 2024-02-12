package org.example.jpastudent.config;

import org.example.jpastudent.model.Student;
import org.example.jpastudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;



//@Component
public class InitData implements CommandLineRunner {


    @Autowired
    StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("Yousra");
        s1.setBornDate(LocalDate.of(1996, 8, 23));
        s1.setBornTime(LocalTime.of(5, 59));
        studentRepository.save(s1);

        //opdatere navnet
        s1.setName("Maria");
        studentRepository.save(s1);

        Student s2 = new Student();
        s2.setName("Nanna");
        s2.setBornDate(LocalDate.of(2000, 1, 12));
        s2.setBornTime(LocalTime.of(2, 0));
        studentRepository.save(s2);

    }


}
