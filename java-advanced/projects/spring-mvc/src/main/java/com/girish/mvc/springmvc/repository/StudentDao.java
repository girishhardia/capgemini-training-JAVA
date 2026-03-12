package com.girish.mvc.springmvc.repository;

import com.girish.mvc.springmvc.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
}
