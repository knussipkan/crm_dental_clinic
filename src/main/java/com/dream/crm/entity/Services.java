package com.dream.crm.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "services", schema = "public", catalog = "CRM")
public class Services {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "service_id")
    private long serviceId;

    @Column(name = "price")
    private double price;

    @Column(name = "title")
    private String title;

}
