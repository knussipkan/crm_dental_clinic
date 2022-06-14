package com.dream.crm.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "patient_history", schema = "public", catalog = "CRM")
public class PatientHistory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "patient_history_id")
    private long patientHistoryId;

    @Column(name = "patient_id")
    private Integer patientId;

    @Column(name = "doctor_id")
    private Integer doctorId;

    @Column(name = "visit_date")
    private Date visitDate;

    @Column(name = "visit_time")
    private Time visitTime;

    @Column(name = "status_record_id")
    private Integer statusRecordId;

    @Column(name = "diagnose_id")
    private Integer diagnoseId;

    @Column(name = "order_service_id")
    private Integer orderServiceId;

    @Column(name = "diagnose_history_id")
    private Integer diagnoseHistoryId;

}
