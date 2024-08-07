package edu.miu.cs.cs425.studentmgmt.model.repositories;

import edu.miu.cs.cs425.studentmgmt.model.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
