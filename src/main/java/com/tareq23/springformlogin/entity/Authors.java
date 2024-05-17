package com.tareq23.springformlogin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity(name = "authors")
public class Authors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank
    @Size(min = 4, max = 50)
    private String name;

    @NotBlank
    private String biography;



}
