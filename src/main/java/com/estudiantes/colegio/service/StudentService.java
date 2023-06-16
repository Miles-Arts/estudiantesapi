package com.estudiantes.colegio.service;

import com.estudiantes.colegio.entity.Student;
import com.estudiantes.colegio.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepository iStudentRepository;


    // LLamara a todos los estudiantes
    public List<Student> getStudents() {
        return iStudentRepository.findAll();
    }


    //Llamar sólo por Id
    public Optional<Student> getStudent(Long id) {
        return iStudentRepository.findById(id);
    }

    //guardar o Actualizar
    public void saveOrUpdate(Student student) {
        iStudentRepository.save(student);
    }

    //Delete por Id
    public void deleteStudent(Long id) {
        iStudentRepository.deleteById(id);
    }


}
