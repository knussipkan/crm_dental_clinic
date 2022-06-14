package com.dream.crm.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "admin_login", schema = "public", catalog = "CRM")
public class AdminLogin {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "admin_id")
    private long adminId;

    @Column(name = "login")
    private String login;

    @Column(name = "passworrd")
    private String passworrd;

    @Column(name = "user_role")
    private Integer userRole;


}
