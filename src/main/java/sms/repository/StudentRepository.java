package sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
