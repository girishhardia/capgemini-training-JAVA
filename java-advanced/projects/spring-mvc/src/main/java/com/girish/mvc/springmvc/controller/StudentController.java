package com.girish.mvc.springmvc.controller;

import com.girish.mvc.springmvc.model.Student;
import com.girish.mvc.springmvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("student", new Student());
        return "register";
    }

    @PostMapping("/register")
    public String handleRegistration(@ModelAttribute("student") Student student, Model model) {
        studentService.registerStudent(student);
        model.addAttribute("name", student.getName());
        return "success";
    }
}
