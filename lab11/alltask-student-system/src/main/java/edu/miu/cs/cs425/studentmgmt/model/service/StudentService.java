package edu.miu.cs.cs425.studentmgmt.model.service;

import edu.miu.cs.cs425.studentmgmt.model.domain.Student;
import edu.miu.cs.cs425.studentmgmt.model.repositories.StudentRepository;
import jakarta.annotation.Nullable;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public Student saveStudent(Student student) {

       return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
      Optional<Student> student=studentRepository.findById(id);
      return student.orElse(null);


    }

    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Student student) {
        Optional<Student> studentPresent=studentRepository.findById(student.getStudentId());
        if(studentPresent.isPresent())
        {
            return studentRepository.save(student);
        }
       throw new RuntimeException("Student not found");
    }


}
