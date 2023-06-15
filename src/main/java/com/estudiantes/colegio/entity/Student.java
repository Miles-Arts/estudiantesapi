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
    private String firstname;
    private String lastname;
    @Column(name = "email_addres", unique = true)
    private String email;

}
