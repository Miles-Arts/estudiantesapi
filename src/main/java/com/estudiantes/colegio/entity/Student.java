package com.estudiantes.colegio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data //No es necsario los Set y Get
@Entity
@Table(name = "tbl_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentID;
    private String firstName;
    private String lastName;
    @Column(name = "email_address", unique = true, nullable = false)
    private String email;

}
