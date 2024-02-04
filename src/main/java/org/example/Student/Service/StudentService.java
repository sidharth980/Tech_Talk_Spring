package org.example.Student.Service;


import org.example.Student.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;


@Service  // Indicates a service component
public class StudentService {
    private List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(long id) {
        return students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
    }

    public void addStudent(Student student) {
        student.setId(getNextId()); // Assign unique ID
        students.add(student);
    }

    private long getNextId() {
        return students.stream().mapToLong(Student::getId).max().orElse(0) + 1;
    }
}