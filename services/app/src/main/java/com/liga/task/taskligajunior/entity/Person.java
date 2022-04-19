package com.liga.task.taskligajunior.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "people", schema = "public")
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue
    Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

}
