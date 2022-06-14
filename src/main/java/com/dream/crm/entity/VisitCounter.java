package com.dream.crm.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "visit_counter", schema = "public", catalog = "CRM")
public class VisitCounter {

    @Id
    @Column(name = "patient_history_id")
    private int patientHistoryId;

    @Column(name = "visit_count")
    private int visitCount;

}
