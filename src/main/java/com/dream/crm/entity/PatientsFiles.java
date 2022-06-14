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
@Table(name = "patients_files", schema = "public", catalog = "CRM")
public class PatientsFiles {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "patint_files_id")
    private long patintFilesId;

    @Column(name = "patient_id")
    private Integer patientId;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_date")
    private Date updatedDate;

}
