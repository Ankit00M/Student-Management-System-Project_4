package sms.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import sms.entity.Student;
import sms.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }

    public Student getStudent(Long id) {
        return repo.findById(id).orElseThrow(() ->
                new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Student not found"
                )
        );
    }

    public Student getStudentById(Long id) {
        return getStudent(id);
    }
}
