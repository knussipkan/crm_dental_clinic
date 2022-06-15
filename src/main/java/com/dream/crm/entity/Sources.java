package com.dream.crm.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "sources", schema = "public", catalog = "CRM")
public class Sources {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "source_id")
    private long sourceId;

    @Column(name = "title")
    private String title;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", referencedColumnName = "source_id")
    private Patient patient;
}
