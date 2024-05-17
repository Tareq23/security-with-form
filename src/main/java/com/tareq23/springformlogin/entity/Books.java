package com.tareq23.springformlogin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Date;

@Entity(name = "books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank
    @Size(min = 10, max = 100)
    private String title;

    @NotBlank
    @Min(30)
    private Double price;

    @NotBlank
    private String sortDescription;


}
