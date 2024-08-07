package edu.miu.cs.cs425.studentmgmt.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public String saveStudent(Student student) {

        studentRepository.save(student);
        return "\nStudent named " + student.getFirstName()+ " has been saved in database";

    }
}
