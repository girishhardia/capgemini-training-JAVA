package com.girish.mvc.springmvc.service;

import com.girish.mvc.springmvc.model.Student;
import com.girish.mvc.springmvc.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public void registerStudent(Student student) {
        studentDao.save(student);
    }

    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }
}
