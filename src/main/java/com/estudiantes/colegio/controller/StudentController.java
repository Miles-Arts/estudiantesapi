package com.estudiantes.colegio.controller;

import com.estudiantes.colegio.entity.Student;
import com.estudiantes.colegio.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {


    @Autowired
    public StudentService studentService;
    /*public final StudentService studentService;*/

   /* public StudentController() {
        studentService = null;
    }
*/

    // LLamar
    @GetMapping
    public List<Student> getAll() {
        return studentService.getStudents();
    }

    //Consultar
    @GetMapping("/{studentId}")
    public Optional<Student> getById(@PathVariable("studentId") Long studentId) {
        return studentService.getStudent(studentId);
    }

    //Guardar o actualizar
    @PostMapping
    public Student saveUpdate(@RequestBody Student student) {
         studentService.saveOrUpdate(student);
         return student;
    }

    //Delete
    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
         studentService.deleteStudent(studentId);
    }

}
