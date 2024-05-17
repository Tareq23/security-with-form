package com.tareq23.springformlogin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import java.util.Date;

@Entity(name = "customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank
    @Size(min = 4, max = 50)
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;

    private Date dob;

    @Column(columnDefinition = "boolean default false")
    private boolean isVerified;

}
