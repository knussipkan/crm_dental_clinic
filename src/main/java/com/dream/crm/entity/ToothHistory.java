package com.dream.crm.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "tooth_history", schema = "public", catalog = "CRM")
public class ToothHistory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "tooth_history_id")
    private long toothHistoryId;
    @Basic
    @Column(name = "patient_id")
    private int patientId;
    @Basic
    @Column(name = "tooth_number")
    private Integer toothNumber;
    @Basic
    @Column(name = "status_id")
    private int statusId;
    @Basic
    @Column(name = "service_id")
    private Integer serviceId;

}
