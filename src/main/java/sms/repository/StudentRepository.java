package sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sms.entity.Student;

import java.util.List;

    public interface StudentRepository extends JpaRepository<Student, Integer>{
}
