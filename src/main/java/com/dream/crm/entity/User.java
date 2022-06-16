package com.dream.crm.entity;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "public", catalog = "CRM")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "user_role_id")
    private String user_role_id;

    @ManyToOne
    @JoinColumn(name = "user_role_id", referencedColumnName = "user_role_id")
    private Userrole userrole;

}
