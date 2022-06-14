package com.dream.crm.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "status_record", schema = "public", catalog = "CRM")
public class StatusRecord {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "status_record_id")
    private long statusRecordId;

    @Column(name = "title")
    private String title;

}
