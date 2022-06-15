package com.dream.crm.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "diagnoses", schema = "public", catalog = "CRM")
public class Diagnoses {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "diagnose_id")
    private long diagnoseId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

}
