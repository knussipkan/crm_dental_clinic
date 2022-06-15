package com.dream.crm.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "diagnoses_history", schema = "public", catalog = "CRM")
public class DiagnosesHistory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "diagnoses_history_id")
    private long diagnosesHistoryId;

    @Column(name = "diagnoses_id")
    private Integer diagnosesId;

    @Column(name = "patient_id")
    private Integer patientId;

    @OneToMany
    @JoinColumn(name = "diagnoses_id", referencedColumnName = "diagnoses_id")
    private List<Diagnoses> diagnoses;

    @ManyToOne
    @JoinColumn(name = "patient_history_id", referencedColumnName = "diagnose_history_id")
    private PatientHistory patientHistory;
}
