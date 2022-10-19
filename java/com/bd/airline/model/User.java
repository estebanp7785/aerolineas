package com.bd.airline.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_user")
    private Long id;

    @Column(name="username", nullable = false,
    table="user", unique = false)
    private String username;

    @Column(name="password", nullable = false,
    table = "user")
    private String password;

    @Column(name="email", nullable = true,
    table="user")
    private  String email;



}
