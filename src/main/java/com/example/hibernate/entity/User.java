package com.example.hibernate.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * <p></p>
 *
 * @author : lon
 * @date : 2021-06-22 15:58
 **/
@Entity
@Data
@Table(name = "h_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "h_name")
    private String name;


}
