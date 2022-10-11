package com.org.college.service;

import com.org.college.model.Student;
import org.springframework.web.bind.annotation.RequestBody;

public interface StudentService {
    public void addStudent(Student student);
}
