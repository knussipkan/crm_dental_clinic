package com.dream.crm.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "status", schema = "public", catalog = "CRM")
public class Status {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "status_id")
    private long statusId;

    @Column(name = "title")
    private String title;

}
