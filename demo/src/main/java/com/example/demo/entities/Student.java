package com.example.demo.entities;



import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

    @ManyToMany
    private Set<Subject> subjects;


    // Getters and setters
}
