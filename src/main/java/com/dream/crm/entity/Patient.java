package com.dream.crm.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "patient", schema = "public", catalog = "CRM")
public class Patient {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "patient_id")
    private long patientId;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "commentss")
    private String commentss;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_n")
    private String phoneN;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email")
    private String email;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "date_added")
    private Date dateAdded;

    @Column(name = "date_modified")
    private Date dateModified;

    @Column(name = "allergy")
    private String allergy;

    @Column(name = "illness")
    private String illness;

    @Column(name = "source_id")
    private Integer sourceId;

    @OneToOne
    @JoinColumn(name = "source_id", referencedColumnName = "source_id")
    private Sources sources;

}
