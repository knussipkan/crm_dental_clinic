package com.dream.crm.entity;

import javax.persistence.*;

@Entity
@Table(name = "userrole", schema = "public", catalog = "CRM")
public class Userrole {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_role_id")
    private long userRoleId;

    @Column(name = "user_role_name")
    private String userRoleName;

}
