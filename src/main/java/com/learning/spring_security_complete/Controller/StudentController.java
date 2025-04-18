package com.learning.spring_security_complete.Controller;


import com.learning.spring_security_complete.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
   new Student(1 , "Manoj" ,"23"),
    new Student(2 , "Swapna" , "24"),
    new Student(3 , "Vissu" , "23")));

    @GetMapping(value = "/students")
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping(value = "/students")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return  student;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");

    }
}
